package homework7.task7_1;

import homework7.task7_1.buyer.Buyer;
import homework7.task7_1.market.MiniMarket;

import java.util.Map;
import java.util.UUID;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

public class Main {

    private static final Random random = new Random();
    private static final Map<Integer, MiniMarket.Good> marketGoods = new MiniMarket().getGoods();

    public static void main(String[] args) throws InterruptedException {
        var marketScheduler = Executors
                .newScheduledThreadPool(Runtime.getRuntime().availableProcessors() - 1);
        var closeMarketScheduler = Executors.newSingleThreadScheduledExecutor();
        var executorService = Executors.newCachedThreadPool();

        ScheduledFuture<?> closeTheMarket = closeMarketScheduler.schedule(() -> {
            marketScheduler.shutdownNow();
            executorService.shutdown();
        }, 2, TimeUnit.MINUTES);

        marketScheduler.scheduleAtFixedRate(createNewBuyer(executorService),
                0, 1, TimeUnit.SECONDS);

        while (!closeTheMarket.isDone());
        while (!executorService.isTerminated());
        closeMarketScheduler.shutdownNow();

        System.out.println("\n\nСуперМегаМаркет закрыт! Все товары проданы! Больше не приходите!");
    }

    private static Runnable createNewBuyer(ExecutorService executorService) {
        return () -> {
            int countOfByers = random.nextInt(3);
            for (int i = 0; i < countOfByers; i++) {
                Buyer buyer = new Buyer(UUID.randomUUID(), marketGoods);
                executorService.submit(() -> {
                    buyer.enterToMarket();
                    int countOfGoods = random.nextInt(1, 5);
                    for (int j = 0; j < countOfGoods; j++) buyer.chooseGoods();
                    buyer.goOut();
                });
            }
        };
    }
}

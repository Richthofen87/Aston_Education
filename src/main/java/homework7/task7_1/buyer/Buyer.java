package homework7.task7_1.buyer;

import homework7.task7_1.market.AbstractMarket;
import homework7.task7_1.market.MiniMarket;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.util.concurrent.TimeUnit;

@ToString
@EqualsAndHashCode
public class Buyer implements IBuyer, IUseBasket {

    private final UUID buyerId;
    private MiniMarket.Basket basket;
    private final Map<AbstractMarket.Good, Integer> marketGoods;

    private final Random random = new Random();

    public Buyer(UUID buyerId, Map<AbstractMarket.Good, Integer> marketGoods) {
        this.buyerId = buyerId;
        this.marketGoods = marketGoods;
    }

    @Override
    public void enterToMarket() {
        System.out.printf("\nПокупатель %s вошёл в маркет", buyerId);
        takeBasket();
    }

    @Override
    public void chooseGoods() {
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(500, 2000));
            putGoodsToBasket();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void goOut() {
        System.out.printf("\nПокупатель %s собрался на выход", buyerId);
    }

    @Override
    public void takeBasket() {
        basket = new MiniMarket.Basket();
    }

    @Override
    public void putGoodsToBasket() {
        List<MiniMarket.Good> marketGoods = getMarketGoods();
        AbstractMarket.Good good =  marketGoods.get(random.nextInt(marketGoods.size()));
        Objects.requireNonNull(basket, "Необходимо взять корзину")
                .getGoods()
                .add(good);
        System.out.printf("\nПокупатель %s положил в корзину %s", buyerId, good);
    }

    public UUID getBuyerId() {
        return buyerId;
    }

    private List<MiniMarket.Good> getMarketGoods() {
        return new ArrayList<>(marketGoods.keySet());
    }
}

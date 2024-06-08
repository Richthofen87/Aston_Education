package homework7.task7_1.market;

import lombok.Data;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractMarket {
    public abstract Map<Good, Integer> getGoods();
    public abstract void setGoods(Map<Good, Integer> goods);

    @Data
    public static class Basket {
        private List<MiniMarket.Good> goods = new ArrayList<>();
    }

    public enum Good {
        POTATO, FISH, COCA_COLA, SNICKERS, MILK, BEAR, EGGS, MEAL, FRUITS, VEGETABLES
    }
}

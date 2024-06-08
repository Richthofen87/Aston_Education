package homework7.task7_1.market;

import lombok.Data;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public abstract class AbstractMarket {
    public abstract Map<Integer, Good> getGoods();
    public abstract void setGoods(Map<Integer, Good> goods);

    @Data
    public static class Basket {
        private List<MiniMarket.Good> goods = new ArrayList<>();
    }

    public enum Good {
        POTATO, FISH, COCA_COLA, SNICKERS, MILK, BEAR, EGGS, MEAL, FRUITS, VEGETABLES
    }
}

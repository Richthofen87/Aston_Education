package homework7.task7_1.market;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;
import java.util.HashMap;

@Data
@EqualsAndHashCode(callSuper = true)
public class MiniMarket extends AbstractMarket {

    private Map<Good, Integer> goods;

    public MiniMarket() {
        goods = new HashMap<>() {{
           put(Good.FISH, 450);
           put(Good.MILK, 175);
           put(Good.BEAR, 110);
           put(Good.EGGS, 145);
           put(Good.MEAL, 650);
           put(Good.POTATO, 250);
           put(Good.FRUITS, 350);
           put(Good.SNICKERS, 75);
           put(Good.COCA_COLA, 150);
           put(Good.VEGETABLES, 500);
        }};
    }

    @Override
    public Map<Good, Integer> getGoods() {
        return new HashMap<>(goods);
    }
}
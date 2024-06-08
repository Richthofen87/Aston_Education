package homework7.task7_1.market;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;
import java.util.HashMap;

@Data
@EqualsAndHashCode(callSuper = true)
public class MiniMarket extends AbstractMarket {

    private Map<Integer, Good> goods;

    public MiniMarket() {
        goods = new HashMap<>() {{
           put(450, Good.FISH);
           put(175, Good.MILK);
           put(110, Good.BEAR);
           put(145, Good.EGGS);
           put(650, Good.MEAL);
           put(250, Good.POTATO);
           put(350, Good.FRUITS);
           put(75, Good.SNICKERS);
           put(150, Good.COCA_COLA);
           put(500, Good.VEGETABLES);
        }};
    }

    @Override
    public Map<Integer, Good> getGoods() {
        return new HashMap<>(goods);
    }
}
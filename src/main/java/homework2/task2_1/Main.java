package homework2.task2_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>() {{
            add(new Sedan());
            add(new Truck());
        }};
        for (Car car : cars) {
            car.start();
            car.stop();
            System.out.printf("Number of doors - %s, fuel type - %s, trunk capacity - %s\n"
                    , car.getNumberOfDoors(), car.getFuelType(), car.getTrunkCapacity());
            if (car instanceof Sedan sedan)
                System.out.printf("Luxury level - %s\n", sedan.getLuxuryLevel());
            else System.out.printf("Max load capacity - %s", ((Truck) car).getMaxLoadCapacity());
        }
    }
}

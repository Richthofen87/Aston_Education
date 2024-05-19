package Homework2.Task2_1;

public class Truck extends Car {
    @Override
    int getNumberOfDoors() {
        return 5;
    }

    @Override
    int getTrunkCapacity() {
        return 50;
    }

    @Override
    public void start() {
        System.out.println("Truck started");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }

    @Override
    public String getFuelType() {
        return "diesel";
    }

    String getMaxLoadCapacity() {
        return "500 kilos";
    }
}

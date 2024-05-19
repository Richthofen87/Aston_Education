package Homework2.Task2_1;

public class Sedan extends Car{
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
        System.out.println("Sedan started");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopped");
    }

    @Override
    public String getFuelType() {
        return "petrol";
    }

    String getLuxuryLevel() {
        return "Maximum luxury";
    }
}

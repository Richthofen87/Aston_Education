package Homework2.Task2_3;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setRam(16);
        computer.setProcessor(new Computer.Processor("AMD"));
        System.out.printf("Processor model - %s, RAM size - %s",
                computer.getProcessor().getDetails(), computer.getRam().getDetails());
    }
}

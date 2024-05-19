package Homework2.Task2_3;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class Computer {

    private RAM ram;
    private Processor processor;

    public void setRam(int ramSize) {
        ram = new RAM(ramSize);
    }

    @RequiredArgsConstructor
    public static class Processor {

        private final String model;
        public String getDetails() {
            return model;
        }
    }

    @AllArgsConstructor
    public class RAM {

        private int size;
        public int getDetails() {
            return size;
        }
    }
}

package ru.aston.education;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Animal> animals;

    static {
        animals = new ArrayList<>() {{
            add(new Dog("Sharik" , 5));
            add(new Cat("Mursic", 3));
        }};
    }

    public static void main(String[] args) {
        Animal frog = new Frog();
        frog.age = 1;
        frog.setName("Qween");
        animals.add(frog);
        animals.forEach(Animal::saySomeThing);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private abstract static class Animal {
        private int age;
        private String name;

        public void saySomeThing() {
            System.out.printf("A %s named %s said " ,
                    this.getClass().getSimpleName(), name);
        }
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static class Dog extends Animal {
        private String color;

        {
            color = "black";
        }

        public Dog(String name, int age) {
            super(age, name);
        }

        @Override
        public void saySomeThing() {
            super.saySomeThing();
            System.out.println("WOOF!");
        }
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static class Cat extends Animal {

        public Cat(String name, int age) {
            super(age, name);
        }

        @Override
        public void saySomeThing() {
            super.saySomeThing();
            System.out.println("MEOW!");
        }
    }

    @Data
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = true)
    private static class Frog extends Animal {

        public Frog(String name, int age) {
            super(age, name);
        }

        @Override
        public void saySomeThing() {
            super.saySomeThing();
            System.out.println("KWA!");
        }
    }
}
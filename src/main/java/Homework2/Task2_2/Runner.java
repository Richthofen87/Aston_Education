package Homework2.Task2_2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Fedor", 25,
                Arrays.asList("Programming", "Traveling", "Fitness"));
        System.out.println(person);

        person.hobbies().add("Swimming");
        person.hobbies().forEach(System.out::println);
    }
}

package Homework2.Task2_2;

import java.util.Arrays;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson("Fedor", 25,
                Arrays.asList("Programming", "Traveling", "Fitness"));
        System.out.println("Before change -> " + immutablePerson);

        immutablePerson.hobbies().add("Swimming");
        System.out.println("\nAfter change -> " + immutablePerson);

        MutablePerson mutablePerson = new MutablePerson("Sergei", 36,
                new ArrayList<>() {{
                    add("Swimming");
                    add("Traveling");
                    add("Chilling");
        }});
        System.out.println("\nBefore change -> " + mutablePerson);

        mutablePerson.setName("Ilya");
        mutablePerson.setAge(18);
        mutablePerson.getHobbies().remove("Chilling");
        System.out.println("\nAfter change -> " + mutablePerson);
    }
}

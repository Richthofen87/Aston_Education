package Homework4.Task4_3;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {

    private String name;
    private Sex sex;
    private int age;

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    public enum Sex {
        MAIL, FEMAIL
    }
}

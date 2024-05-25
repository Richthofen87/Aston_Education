package Homework4.Task4_3;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Olga", Person.Sex.MAIL, 18);
        Person person2 = new Person("Vladimir", Person.Sex.FEMAIL, 21);
        Person person3 = new Person("John", Person.Sex.FEMAIL, 25);
        Set<Person> personSet = new HashSet<>(3) {{
            add(person1);
            add(person2);
            add(person3);
        }};
        personSet.forEach(System.out::println);
        personSet.remove(person2);
        personSet.remove(person3);
        System.out.println(personSet.contains(person1));
    }
}

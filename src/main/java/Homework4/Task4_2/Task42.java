package Homework4.Task4_2;

import java.util.LinkedList;

public class Task42 {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.addFirst("China");
        countries.addFirst("Belarus");
        countries.addLast("USA");
        countries.addLast("Kazakhstan");
        countries.forEach(System.out::println);
        countries.removeFirst();
        countries.removeLast();
        countries.getFirst();
        countries.getLast();
    }
}

package homework4.task4_1;

import java.util.List;
import java.util.ArrayList;

public class Task41 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(3) {{
            add("China");
            add("Belarus");
            add("Kazakhstan");
        }};
        countries.forEach(System.out::println);
        countries.set(1, "USA");
        countries.remove(1);
        countries.remove("China");
        countries.indexOf("Kazakhstan");
        countries.contains("USA");
    }
}

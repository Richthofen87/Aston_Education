package homework4.task4_4;

import lombok.Data;

import java.util.Map;
import java.util.HashMap;

@Data
public class Student {
    private String name;
    private int course;
    private int group;
    private Map<String, Integer> grades = new HashMap<>();

    public Student(String name, int group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }
}

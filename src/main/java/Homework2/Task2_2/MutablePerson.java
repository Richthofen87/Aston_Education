package Homework2.Task2_2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MutablePerson {
    private String name;
    private int age;
    private List<String> hobbies;
}

package Homework2.Task2_2;

import java.util.List;
import java.util.ArrayList;

public record ImmutablePerson(String name, int age, List<String> hobbies) {

    @Override
    public List<String> hobbies() {
        return new ArrayList<>(hobbies);
    }
}

package homework5.task5_1;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9);
        Optional<Integer> optional = list.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .reduce(Integer::sum);
        optional.ifPresent(System.out::println);
    }
}

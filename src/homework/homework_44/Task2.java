package homework.homework_44;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
 */
public class Task2 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "grape", "mango", "fig");

        Optional<String> minLengthString = strings.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //   .min(Comparator.comparingInt(String::length));

        minLengthString.ifPresent(s -> System.out.println("Строка с минимальной длиной: " + s));
    }

}

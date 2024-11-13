package homework.homework_44;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению последней цифры
в числе и выведите результат на экране
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 16, 12, 23, 8, 10, 34, 7, 42, 19, 11, 110);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 10)
                .sorted((n1, n2) -> Integer.compare(n1 % 10, n2 % 10))
                .collect(Collectors.toList());


        System.out.println("Числа больше десяти и отсортированные числа по последней цифре: " + result);

    }


}

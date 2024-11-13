package homework.homework_44;

import java.util.List;
import java.util.stream.Collectors;
/*
Task 3
Имеется список целых чисел.
Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2, и
собрать результат в новый список
 */
public class Task3 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .peek(System.out::println)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}

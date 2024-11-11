package homework.homework_43;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные,
больше 10 и меньше 100
Для фильтрации используйте Stream API
 */
public class Task1 {
    public static List<Integer> filterNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)          // Четные числа
                .filter(n -> n > 10)              // Числа больше 10
                .filter(n -> n < 100)             // Числа меньше 100
                .collect(Collectors.toList());    // Собираем результат в новый список
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 15, 18, 35, 42, 68, 72, 114, 6, 22, 99, 105, 50);
        List<Integer> filteredNumbers = filterNumbers(numbers);

        System.out.println("Вывод отфильтрованных чисел: " + filteredNumbers);
    }

}

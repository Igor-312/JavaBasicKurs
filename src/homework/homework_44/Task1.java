package homework.homework_44;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения по значению последней цифры
в числе и выведите результат на экране
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 16, 12, 23, 8, 10, 34, 7, 42, 19, 11, 110);

        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 10) {
                filteredNumbers.add(number);
            }
        }
        System.out.println("Числа больше десяти: " + filteredNumbers);

        filteredNumbers.sort(Comparator.comparingInt(n -> n % 10));

        System.out.println("Отсортированные числа по последней цифре: " + filteredNumbers);

    }


}

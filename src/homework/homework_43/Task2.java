package homework.homework_43;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A") и отсортируйте
их в алфавитном порядке.
Результат сохраните в новый список строк.
Опционально + удалите дубликаты из списка строк
 */
public class Task2 {
    public static List<String> filterAndSortStrings(List<String> strings, String startingLetter) {
        return strings.stream()
                .filter(s -> s.startsWith(startingLetter))   // Фильтрация строк, начинающихся на заданную букву
                .distinct()                                   // Удаление дубликатов
                .sorted()                                     // Сортировка в алфавитном порядке
                .collect(Collectors.toList());                // Сбор результата в новый список
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Apricot", "Apple", "Apricot", "Banana", "Orange");
        List<String> filteredAndSortedStrings = filterAndSortStrings(strings, "A");

        System.out.println("Вывод отфильтрованных и отсортированных строк: " + filteredAndSortedStrings);
    }

}
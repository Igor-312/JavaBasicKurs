package homework.homework_41;

import java.util.HashMap;
import java.util.Map;

/*
Task 3
Пересечение двух карт:
Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту,
содержащую только те записи, ключи которых присутствуют в обеих исходных картах.
Для совпадающих ключей значение можно брать из любой карты
 Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);
        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
Copy
//Output
banana: 20
cherry: 30
 */
public class Task3 {
    public static void main(String[] args) {
        // Пример карт
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        // Получаем пересечение карт
        Map<String, Integer> intersectionMap = intersection(map1, map2);

        // Выводим результат
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    // Метод для нахождения пересечения двух карт
    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> intersectionMap = new HashMap<>();

        // Проходим по ключам первой карты
        for (String key : map1.keySet()) {
            // Если ключ есть в обеих картах, добавляем в результат
            if (map2.containsKey(key)) {
                intersectionMap.put(key, map1.get(key));  // Берем значение из map1
            }
        }

        return intersectionMap;
    }


}

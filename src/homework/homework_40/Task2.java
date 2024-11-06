package homework.homework_40;

import java.util.*;
/*
Task 2
Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами. Некоторые слова должны
повторяться в обоих множествах.
Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество, содержащее все уникальные
элементы из обоих множеств (объединение множеств).
Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество, содержащее только
элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов, которые есть
в первом множестве, но отсутствуют во втором (разность множеств).
Результат каждого метода необходимо выводить в консоль для наглядности.
Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов
операций.
 */
public class Task2 {

    // Метод объединения (union) двух множеств
    public static Set<String> union(Set<String> set1, Set<String> set2) {

        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Метод пересечения (intersection) двух множеств
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    // Метод разности (difference) двух множеств
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println("Объединение: " + union(set1, set2));
        System.out.println("Пересечение: " + intersection(set1, set2));
        System.out.println("Разность: " + difference(set1, set2));
    }
}

package homework.homework_42;

import java.util.HashMap;

/*
Task 1
Напишите программу, которая проверяет, являются ли две заданные строки анаграммами (то есть содержат ли они одинаковые
буквы в разном порядке).
Инструкции:
Используйте HashMap<Character, Integer> для подсчета количества каждого символа в строках.
Сравните две карты, чтобы определить, являются ли строки анаграммами.
P.S.
Метод equals() для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение — независимо от порядка
ключей.
Это означает, что если две карты содержат одинаковые пары ключ-значение, то метод equals() вернет true, даже если
порядок
добавления или хранения этих пар различается.
 */
public class Task1 {
    public static boolean areAnagrams(String str1, String str2) {
        // Если строки разные по длине, они не могут быть анаграммами
        if (str1.length() != str2.length()) {
            return false;
        }

        // Создаем карты для подсчета количества символов
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Заполняем карты для каждой строки
        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        // Сравниваем карты
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        // Пример использования
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }
    }

}

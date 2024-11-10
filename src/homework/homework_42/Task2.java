package homework.homework_42;

import java.util.HashMap;

/*
Task 2
Подсчет слов по длине
Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).
Инструкции:
Используйте HashMap<Integer, Integer>, где ключом является длина слова, а значением — количество слов этой длины.
Прочитайте текст и обновите карту соответствующим образом.
Выведите результаты подсчета.
 */
public class Task2 {
    public static void countWordLengths(String text) {
        // Создаем карту для подсчета количества слов по длине
        HashMap<Integer, Integer> wordLengthMap = new HashMap<>();

        // Разбиваем строку на слова по пробелам
        String[] words = text.split("\\s+");

        // Перебираем все слова в тексте
        for (String word : words) {
            // Определяем длину слова
            int wordLength = word.length();

            // Обновляем количество слов с такой длиной в карте
            wordLengthMap.put(wordLength, wordLengthMap.getOrDefault(wordLength, 0) + 1);
        }

        // Выводим результаты подсчета
        for (Integer length : wordLengthMap.keySet()) {
            System.out.println("Длина слова: " + length + " | Количество слов: " + wordLengthMap.get(length));
        }
    }

    public static void main(String[] args) {
        // Пример текста
        String text = "Это пример текста, который будет использован для подсчета слов разной длины!";

        // Вызываем метод для подсчета и вывода результатов
        countWordLengths(text);
    }

}

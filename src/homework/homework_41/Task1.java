package homework.homework_41;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>, где
каждому слову соответствует количество его вхождений в текст.
 */
public class Task1 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";
        Map<String, Integer> frequency = getWordFrequency(text);

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static Map<String, Integer> getWordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word,0) +1);
            }
        }
        return wordCount;
    }
}

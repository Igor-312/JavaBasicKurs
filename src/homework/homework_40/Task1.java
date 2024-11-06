package homework.homework_40;

import java.util.*;

public class Task1 {

    public static List<String> getUniqueSortedWords(String list) {
        String newString = list.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = newString.split(" ");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        List<String> wordList = new ArrayList<>(uniqueWords);
        return wordList;
    }

    public static void main(String[] args) {
        String list = "Тестовая строка для удаления слов, которые повторяются. строка для удаления!";
        System.out.println(getUniqueSortedWords(list));
    }

}

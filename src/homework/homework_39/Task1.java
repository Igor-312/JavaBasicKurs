package homework.homework_39;

import java.util.ArrayList;
import java.util.List;

/*
Task1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
 */
public class Task1 {
    public static void main(String[] args) {

        // Вариант числовой
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(List.of(1, 2, 3, 4, 5, 6));
        list2.addAll(List.of(4, 5, 6, 7, 8, 9));
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        list1.retainAll(list2);
        System.out.println("Список элементов, который присутствуют в обеих коллекциях: " + list1);

        System.out.println("=========================================================================");

        // Вариант строчный
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        list3.addAll(List.of("Mercedes", "Audi", "Ford", "VW", "Ferrari", "Porsche", "Lada"));
        list4.addAll(List.of("Ferrari", "Porsche", "Audi", "BMW", "Jeep"));
        System.out.println("List3: " + list3);
        System.out.println("List4: " + list4);
        list3.retainAll(list4);
        System.out.println("Список элементов, который присутствуют в обеих коллекциях: " + list3);

    }
}

package homework.homework_38;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSportApp {
    public static void main(String[] args) {

        System.out.println("\nСортировка спортсменов по заданным параметрам:\n");

        Sportsman[] sportsman = new Sportsman[4];
        sportsman[0] = new Sportsman("Felix", 32, 88.5);
        sportsman[1] = new Sportsman("Max", 25, 89.5);
        sportsman[2] = new Sportsman("Ivan", 30, 95.0);
        sportsman[3] = new Sportsman("Alice", 22, 90.0);


        System.out.println(" ===================== Сортировка по естественному порядку (name) ====================================");
        Arrays.sort(sportsman);
        System.out.println(Arrays.toString(sportsman));

        System.out.println("\n ===================== Сортировка по score с использованием Comparator ===============================");
        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(sportsman, scoreComparator);
        System.out.println(Arrays.toString(sportsman));

        System.out.println("\n ====================== Сортировка по age с использованием анонимного класса =========================");
        Arrays.sort(sportsman, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());

               // TODO разобраться почему не работает код compareTo
               // return s1.getAge().compareTo(s2.getAge());
            }
        });

        System.out.println(Arrays.toString(sportsman));



    }
}

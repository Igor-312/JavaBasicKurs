package homework.homework_06;

import java.util.Random;

/*
  Task 2
Создайте две переменные типа int.
В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
   */
public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int a1 = random.nextInt(51);   // [0, 1 ...49, 50]
        int a2 = random.nextInt(101);   // [0 ...1000]
        int a3 = random.nextInt(51) - 20;

        System.out.println("Случайное значение от 0 до 50: " + a1);
        System.out.println("Случайное значение от 0 до 100: " + a2);
        System.out.println("Случайное значение от -20 до 30: " + a3);

        boolean bool = a1 == a2;
        System.out.println(a1 + "==" + a2 + "->" + bool);
        boolean bool1 = a1 != a2;
        System.out.println(a1 + "!=" + a2 + "->" + bool1);
        boolean bool3 = a1 > a2;
        System.out.println(a1 + ">" + a2 + "->" + bool3);
        boolean bool4 = a2 < a1;
        System.out.println(a1 + "<" + a2 + "->" + bool4);

    }
}

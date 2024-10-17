package homework.homework_07;
/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех
чисел и вывести результат на экран.
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        Random random = new Random();
        int q1 = random.nextInt(101);
        int q2 = random.nextInt(101);
        int q3 = random.nextInt(101);
        int q4 = random.nextInt(101);

        System.out.println(q1 + " | " + q2 + " | " + q3 + " | " + q4);

        int max = q1;
        if (q2 > max) max = q2;
        if (q3 > max) max = q3;
        if (q4 > max) max = q4;

        System.out.println("Максимальное число: " + max);
    }
}

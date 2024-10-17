package homework.homework_08;

import java.util.Random;

/*
Task 6
Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */
public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] num = new int[15];

        int q = 0;
        while (q < num.length) {
            num[q] = random.nextInt(101) - 50;
            System.out.print(num[q] + " , ");
            q++;
        }
        System.out.println("]");

        int min = num[0];
        int x = 0;
        int max = num[0];
        int y = 0;
        while (x < num.length) {
            if (num[x] < min)
                min = num[x];
            x++;
        }
        while (y > num.length) {
            if (num[y] > max)
                max = num[y];
            y++;
        }

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);

    }
}

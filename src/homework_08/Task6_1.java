package homework_08;

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
public class Task6_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int len = 5 + random.nextInt(11);

        int[] array = new int[len];

        int arrayLength = array.length;

        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;

            System.out.print(array[i] + ((i != array.length - 1) ? ", " : "]\n"));

//            if (i != array.length - 1) {
//                System.out.print(", ");
//            } else {
//                System.out.println("]");
            }
            i++;

        }
    }

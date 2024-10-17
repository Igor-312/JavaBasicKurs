package homework.homework_10;

/*
Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен
создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть
скопированы элементы из входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого
метода
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(array, 3);

    } // Methods area

    public static void copyOfArray(int[] array, int newLength) {

        int[] result = new int[newLength];


        String arrayStr = Arrays.toString(result);

        /*
        Массив всегда при создании заполняется значениями по умолчанию
        числовые типы данных (в том числе char) -> 0 / 0.0
         */

        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }

        System.out.println(Arrays.toString(result));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }


}
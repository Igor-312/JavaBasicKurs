package lesson.lesson_08;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arrays; // объявление массива целых чисел
        String[] strings; // Объявление массива строк
        // int array1[]; // Альтернативный способ объявления массива. НЕ РЕКОМЕНДУЕМЫЙ

        // 0 0 0 0
        arrays = new int[4]; //
        strings = new String[10]; //

        int[] array2 = new int[8]; //
        boolean[] booleans = new boolean[3]; //


        int value = arrays[0]; //
        System.out.println("value: " + value);
        System.out.println("array2[3]: " + array2[3]);
        System.out.println("strings[9]: " + strings[9]);
        System.out.println("booleans[1]: " + booleans[1]);

        System.out.println("arrays: " + arrays); // Получим ссылку на адрес в ячейки памяти в куче.

        // Явная инициализация массива
        int[] numbers = new int[]{45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444};

        int val = numbers[0];
        System.out.println("val: " + val);
        System.out.println("numbers: " + numbers[4]);

        numbers[2] = 100;

        System.out.println("Вывести все значения массива");
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j++] + " ; ");
        }
        System.out.println();

        // Новое задание

        Random random = new Random();

        int[] nums = new int[10];
        int k = 0;
        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");

        // Найти минимальное значение в массиве.

        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве: " + min);

    }
}

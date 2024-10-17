package lesson.lesson_19;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};


        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("=============== Сортировка массива =============\n");
        Arrays.sort(array);
        // Arrays.sort(array, 1,3);
        System.out.println(Arrays.toString(array));

        System.out.println("=============== Бинарный поиск =============\n");

        int index = Arrays.binarySearch(array, 50);
        System.out.println("index: " + index);

        System.out.println("=============== Сравнение массивов на равенство =============\n");
        //           [0, 1, 2, 3]
        int[] test = {0, 2, 1, 3};

        System.out.println("array.equals(test): " + array.equals(test));

        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("Arrays.equals(array,test): " + isArraysEquals);

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test): " + mismatchIndex);

        System.out.println("\n============== Многомерные массивы =============");
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.deepToString(arrayD));

        int[][] arrayC = new int[3][4];
        arrayC[0][3] = 1;
        arrayC[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));





    }
}

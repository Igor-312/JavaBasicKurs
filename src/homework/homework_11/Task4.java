package homework.homework_11;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] array = {2, 2, 3, 6, 7, 2};
        int[] res = removeElement(array, 2);
        System.out.println(Arrays.toString(res));

        res[2] = 100;
        System.out.println("Начальный массив: " + Arrays.toString(array));
        System.out.println("Массив из метода: " + Arrays.toString(res));

    }

    private static int[] removeElement(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) count++;

        }

  //      if (count == 0) return array;

        int[] result = new int[array.length - count];

        for (int i = 0, idx = 0; i < array.length; i++) {
            if (array[i] != element) {
                result[idx] = array[i];
                idx++;
            }

        }
        return result;

    }

}

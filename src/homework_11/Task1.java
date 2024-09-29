package homework_11;

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = sumElements(ints);

        System.out.println(sum);



    }

    public static int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }

    public static double sumElements(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }

}

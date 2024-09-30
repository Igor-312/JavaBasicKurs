package homework_14;


/*
Task 2
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
 */
public class Task2 {
    public static void main(String[] args) {
int[] numbers = {1,2,3,4,5,6,7,8,9,};
int sum = sumOfEvenNumbers(numbers);
        System.out.println("Сумма четных чисел: " + sum);
    }

    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}

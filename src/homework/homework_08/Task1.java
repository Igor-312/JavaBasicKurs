package homework.homework_08;

/*
Task 1
Найдите производное всех чисел от 1 до 15 включительно.
Результат выведите на экран
 */
public class Task1 {
    public static void main(String[] args) {


        long number = 1;
        int i = 1;

        while (i <= 15) {
            number *= i;
            i++;
        }
        System.out.println("Произведение чисел: " + number);
    }
}

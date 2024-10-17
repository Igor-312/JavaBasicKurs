package homework.homework_08;

/*
Task 3
Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
 */
public class Task3_2 {
    public static void main(String[] args) {

        int number = 1;
        int count = 0;

     //   System.out.print("Числа, которые делятся на 5: ");

        while (number <= 100 && count <7) {
            if (number % 5 == 0) {
              System.out.print(number + ", ");
              count++;
                number += 5;
            } else {
                number++;
            }
        }
    }
}

package homework_06;

import java.util.Scanner;
/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности
выдаваемой строки.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число с клавиатуры: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        boolean bool = (num % 2 == 0);
        boolean bool1 = (num % 3 == 0);
        boolean bool2 = bool && bool1;

        System.out.println("Number: " + num + " четное: " + bool + " кратно 3: " + bool1 +
                " четное и кратное: " + bool2);

        // Все варианты работают верно.

        // printf()
        /*
        %d - целое число
        %f - число с плавающей точкой
        %s - строка
        %n - символ новой строки
        \n
         */
        System.out.printf("Number: %d четное: %s кратно 3: %s четное и кратное: %s", num, bool, bool1, bool2);

    }
}

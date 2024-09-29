package homework_07;
/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести
число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор: 1, 2 или 3 ");
        int number = scanner.nextInt();
        scanner.nextLine();

      //  if (number == 1) {
     //       System.out.println("Вы ввели число один!");
     //   } else if (number == 2) {
     //       System.out.println("Вы ввели число два!");
    //    } else if (number == 3) {
    //        System.out.println("Вы ввели число три!");
    //    }

        switch (number) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три!");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }

    }
}

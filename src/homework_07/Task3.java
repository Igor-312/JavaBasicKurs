package homework_07;

import java.util.Scanner;

/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об
ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых
двух цифр с суммой последних двух цифр.
Примеры:
Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести четырехзначное число");
        String digitStr = scanner.nextLine();

        if (digitStr.length() != 4) {
            System.out.println("Сообщение об ошибке");
        } else {
            //       System.out.println((int) digitStr.charAt(0));
            //     int code1 = digitStr.charAt(0) - 48;
            //   System.out.println(code1);
        }
            if (digitStr.charAt(0) + digitStr.charAt(1) == digitStr.charAt(2) + digitStr.charAt(3)); {
            System.out.println("Число счастливое");

        }
    }
}

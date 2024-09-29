package homework_09;

/*
Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
 */
public class Task2 {
    public static void main(String[] args) {
        powTwoV2(-2);
    }

    public static void powTwoV2(int pow) {

        if (pow >= 0) {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result = result * 2;
            }
            System.out.printf("2 ^ %d = %d\n", pow, result);
        } else {
            pow = pow * -1;
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result = result * 2;
        }

            double doubleResult = 1 / result;
            System.out.printf("2 ^ -%d = 1/ %d = %.4f\n", pow, result, doubleResult);
            }

    }


    public static void powTwo(int pow) {
        // 2 ^ 3 = 2 * 2 * 2
        // 2 ^ 2 = 4
        // 2 ^ (-2) = 1 / (2 ^ 2) = 1 / 4 = 0.25

        boolean isPositive = pow >= 0;

        pow = (isPositive) ? pow : pow * -1;

        //       if (!isPositive) {
//            pow = pow * (-1);
//        }

        int result = 1;

        for (int i = 0; i < pow; i++) {
            result = result * 2;
        }
        if (isPositive) {
            System.out.printf("2 ^ %d = %d\n", pow, result);
        } else {
            System.out.printf("2 ^ %d = %.4f\n", pow, 1 / (double) result);
        }
    }


}

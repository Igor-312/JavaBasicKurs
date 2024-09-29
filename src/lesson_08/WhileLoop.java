package lesson_08;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 5;  // инициализация переменной


        while (number <= 5) {  // Условие цикла
            System.out.println(number); // Действие: вывод числа
            number++; // number = number + 1;
        }

        System.out.println("Цикл закончен. Продолжаем выполнение программы");

   //     int number = 100;

 //       while (y < 10) {
   //         System.out.println(y);
 //       }

        int i = 100;

        while (i >= 90) {  // Условие цикла
            System.out.println(i--); // Действие: вывод числа
//            i--; // number = number + 1;
        }
        System.out.println("Цикл закончен. Продолжаем выполнение программы");

        i = 1; //
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от 1 до 100: " + sum);

        System.out.println("=======================\n");

        i = 1;

        while (i <= 21) {

            if (i % 2 == 0) {  // Число четное
                System.out.println(i);
            }
            i++;
        }
        System.out.println("======================\n");

        String str = "Hello!";

        i = 0;  // 0,1,2/// len-1
        while (i <= str.length() -1)  {
            char ch = str.charAt(i);
            System.out.println(ch);
            i++;
        }




    }
}

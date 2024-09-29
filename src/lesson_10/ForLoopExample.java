package lesson_10;

import java.util.Random;

public class ForLoopExample {
    public static void main(String[] args) {

        /*

        for



         */
//  Вывести все числа от 0 до 10

        int j = 0;
        while (j <= 10) {
            System.out.print(j + ", ");
            j++;
        }

        System.out.println("\nEnd while loop " + j);

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nEnd for loop");

//    //  for ( ; ; ) {
//            System.out.println("Hello World");
//        }

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 10_000_000) {
            System.out.print(i1 + ", ");
            j++;
        }
        System.out.println();
        System.out.println("i1 = " + i1);


        //

        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        System.out.println("Продолжение кода");

        System.out.println("\n =========================");


        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.println("Длинна массива: " + ints.length);

        System.out.print("[");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }
        System.out.println("===================== \n");
        // continue, break

        for (int i = 1; i < 7; i++) {

            if (i == 5) continue;

            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 1; i < 7; i++) {
            if (i == 3) break;
            System.out.print(i + "; ");
        }

        System.out.println("\nEnd loop with break");

        int y = 1;
        while (y < 7) {
            if (y == 3) {
                y++;
                continue;
            }
            System.out.print(y++ + ", ");
        }
        System.out.println("\nEnd while loop with continue");


    }
}

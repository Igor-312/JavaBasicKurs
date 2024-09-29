package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;

        // сравнение на равенство
        boolean b1 = x == y; // x равен y ->  10 равно 5 ->
        System.out.println(x + " == " + y + " -> " + b1);

        // Не равенство "!="
        // X не равен Y
        b1 = x != y;
        System.out.println(x + " != " + y + " -> " + b1);

        // ">"
        // X > Y
        b1 = x > y;
        System.out.println(x + " > " + y + " -> " + b1);

        y = 10;
        b1 = x > y;
        System.out.println(x + " > " + y + " -> " + b1);

        // Больше или равно ">="
        b1 = x >= y;
        System.out.println(x + " >= " + y + " -> " + b1);

        x = 7;
        // "<"
        b1 = x < y;
        System.out.println(x + " < " + y + " -> " + b1);

        // Меньше или равно
        b1 = x <= y;
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"): " + contains);

        System.out.println("=========== Логические операции ============ \n");

        // Логическое НЕ (отрицание)  "!"
        // Меняет значение boolean на противоположное
        boolean b2;
        b2 = !false;
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);

        //
        //
        b2 = true & true;
        System.out.println("true & true: " + b2);
        b2 = (2 < 5) & (11 == 10);// false
        System.out.println("(2 < 5) & (11 == 10) -> " + b2);

        // Логическое ИЛИ "|"
        // Когда достаточно, хотя бы ХОТЯ БЫ ОДНО условие было истинным
        boolean b4 = true | false;
        System.out.println("true | false -> " + b4);
        System.out.println("false | false -> " + (false | false));

        //
        Random random = new Random();
        // В диапазоне то 0 до Х
        int rand = random.nextInt(100);  // (0...x-1) -> (0...99) включительно
        System.out.println("rand: " + rand);
        boolean isEven = rand % 2 ==0;
        boolean isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber: " + isGoodNumber);

        System.out.println("===============\n");

        // Логическое исключающее ИЛИ (XOR) "^"
        //
        boolean b5 = true ^ false;
        System.out.println("true ^ false: " + b5);
        b5 = false ^ true;
        System.out.println("false ^ true: " + b5);
        b5 = true ^ true;
        System.out.println("true ^ true: " + b5);
        b5 = false ^ false;
        System.out.println("false ^ false: " + b5);

        System.out.println("==================== \n");
        //
        boolean b6 = true && false;
        System.out.println("true && false: " + b6);
        b6 = true && true;
        System.out.println("true && true: " + b6);
        b6 = (2 > 5) && (11 == 11);
        System.out.println("(2 > 5) && (11 == 11): " + b6);

        int a = 10;
        int b = 0;

        //
        boolean b7 = (b != 0) && (a / b > 2);
        System.out.println("(b != 0) && (a / b > 2): " + b7);

        //
        //
        boolean b8 = true || (a / b > 2);
        System.out.println("true || (a / b > 2): " + b8);

        System.out.println("====== Приоритет логических операций===");

        System.out.println(true ^ true & false);






    }
}

package lesson_09;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();

        String string = "Java";

        //     System.out.println(string);

        saySomething("Java");

        char ch = 'A';
        char anotherChar = 'B';

        printDecimalCodeChar(ch);
        printDecimalCodeChar(anotherChar);
        printDecimalCodeChar('J');
        System.out.println("====================\n");

        int[] array = {1, 45, 76, 54, 90, 435, 0, 45};

        printArray(array);

        int[] array2 = {1, 2, 3, 4, 567, 7897669, 67967, 567, 0};

        printArray(array2);

        System.out.println("+++++++++++\n");

        // Перегрузка метода
        // написать метод, который выводит на экран числа от 1 до N

        printNumbers(10);
        printNumbers(4, 10);
    }// Method area



    public static void printNumbers(int x, int y) {
        int i = 1;
        while (i <= y) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }

    public static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }


    public static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }

    public static void printDecimalCodeChar(char ch1) {
        System.out.println((int) ch1);
    }


    public static void saySomething(String text) {
        System.out.println(text);
    }

    public static void sayHello() {
        // Тело метода
        System.out.println("Hello!");
    }


} // End class

package homework_04;


public class HomeWork_04 {
    public static void main(String[] args) {

        // Task 1
        int intVal = 10;
        double myDouble;
        myDouble = intVal;
        System.out.println("MyDouble: " + myDouble);

        // Task 2
        double doubleVal = 5.99;
        int myInt = (int) doubleVal;

        System.out.println("doubleVal: " + doubleVal);
        System.out.println("MyInt: " + myInt);

        // Task 3
        long bigNumber = 15_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("BigNumber: " + bigNumber);
        System.out.println("SmallNumber: " + smallNumber);
        // Переполнение типа значений

        // Task 4
        char ch1 = 'i';
        char ch2 = 'g';
        char ch3 = 'o';
        char ch4 = 'r';
        System.out.println("i: " + ch1 + ch2 + ch3 + ch4);

        char ch5 = (char) (ch1 - 32);
        System.out.println(ch5);
        System.out.println("My Name: " + ch5 + ch2 + ch3 + ch4);


    }
}

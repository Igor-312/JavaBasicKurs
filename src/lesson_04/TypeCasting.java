package lesson_04;

public class TypeCasting {
    public static void main(String[] args) {

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // ne javnoe preobrasovanie
        System.out.println("intVal: " + intVal);

        double doubleValue = intVal;
        System.out.println("doubleValue: " + doubleValue);

        // Javnoe preobrasovanie

        double doubleVal = 42.9;
        int int1 = (int) doubleVal; // preobrazovonie iz double v int

        System.out.println("doubleVAl: " + doubleVal);
        System.out.println("int1: " + int1);

        short shortVal = (short) int1;
        System.out.println("shortVal: " + shortVal);

        // g
        System.out.println("========================\n");

        int x = 20;
        int y = 7;

        double result;

        result = x / y;
        // int 2. -> nejavnoe preobrazovanie 2.0 -> result
        System.out.println("result: " + result);

        result = x / 7.0;
        System.out.println("result: " + result);

        result = (float) x / y;
        System.out.println("result float cast: " + result);

        result = x / (double) y;
        System.out.println("result float cast: " + result);


    }
}

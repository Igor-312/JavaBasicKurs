package lesson_03;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;
        //
        result = var1 + var2;
        System.out.println("result: " + result);

        result = 15 + 6;

        System.out.println("result: " + result);

        result = var1 + 5;

        System.out.println("result: " + result);

        result = result + 5;
        System.out.println("result: " + result);

        result = var1 - var2;
        System.out.println("result - : " + result);

        result = var1 * var2;
        System.out.println("result * : " + result);

        result = (1 + 2) * 2;
        System.out.println("result 1 + 2 * 2 : " + result);

        result = var1 / var2;
        System.out.println("result / : " + result);

        System.out.println("16 / 5 : " + 16 / 5);

        System.out.println("Zelochislennoe delenie 4 / 2: " + (4 / 2));
        System.out.println("Zelochislennoe delenie 4 % 2: " + (4 % 2));

        System.out.println("( 5 / 10) = " + ( 5 / 10));
        System.out.println("( 5 % 10) = " + ( 5 % 10));

        System.out.println("( 28 / 10) = " + ( 28 / 10));
        System.out.println("( 28 % 10) = " + ( 28 % 10));

        double doubleVar1 = 20.0;
        double doubleVar2 = 7.0;
        double resultD = doubleVar1 / doubleVar2;
        System.out.println("resultD: " + resultD);

    }
}

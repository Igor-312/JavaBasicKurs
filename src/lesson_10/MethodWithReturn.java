package lesson_10;

public class MethodWithReturn {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = sum(a, b);

        sum = sum(10, 20);
        System.out.println(sum);
    }

    public static int sum(int x, int y) {
        int result = x + y;
        System.out.println(result);
        return result;
    }


}

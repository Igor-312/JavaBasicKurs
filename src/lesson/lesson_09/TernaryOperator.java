package lesson.lesson_09;

public class TernaryOperator {
    public static void main(String[] args) {

        int x = -5;

        String result;

        if (x >= 0) {
            result = "положительное";
        } else {
            result = "отрицательное";
        }

        // Тернарный оператор

        String res1 = (x >= 0) ? "положительное" : "отрицательное";

        System.out.println("Число " + result);

    }
}

package lesson.lesson_07;

public class Block {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println("x:" + x);
            System.out.println("Y:" + y);
        }

        // x = x + y; //Ошибка компиляции. Переменная у не видна (не доступна) вне своего блока.
        // Новая переменная с именем у
        int y = 124;

    }
}

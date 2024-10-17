package lesson.lesson_19;

public class FinalDemo {

    // Имена констант в Java принято писать в верхнем регистре.
    public static final double PI = 3.141519;

    public static final int[] ints = new int[10];

    public static final String COUNTRY = "Germany";

    public static final String[] colors = {"blue", "red", "yellow"};



    private final int x;


    private final int[] array = new int[10];



    public FinalDemo() {
        this.x = 100;

        this.array[0] = 1000;
        this.array[array.length - 1] = 15000;
    }

    public FinalDemo(int x) {
        this.x = x;
    }

    public void changeX() {
        // x = 15; Ошибка компиляции.
    }

    public int getX() {
        return x;
    }

    public double getPiX() {
        return PI * this.x;
    }

}

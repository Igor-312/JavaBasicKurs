package lesson_18.staticBlockDemo;

public class InitExample {

    static String[] colors;
    static int counter = 1;

    private String title = "Hello";
    private int capacity = 10;


    static {
        System.out.println("Static init block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        counter = 10;
    }
    // Не статический блок инициализации.
    {
        System.out.println("NON-static init block run!");
        this.title = "Non-Static block run";
    }

    public InitExample() {
        System.out.println("Constructor run!");
        this.title = "Constructor";
    }

    public String toString() {
        return "title: " + title + ", capacity: " +
                capacity + ", static-counter: " + counter;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

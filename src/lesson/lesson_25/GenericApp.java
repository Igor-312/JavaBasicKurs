package lesson.lesson_25;

public class GenericApp {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        System.out.println(stringBox);

        stringBox.setValue("Hello World");
        System.out.println(stringBox);

//        GenericBox<String> stringBox1 = new GenericBox<>(9);


    }
}

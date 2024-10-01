package lesson_15;

public class Cat {
    public String name;
    public String color;
    public int age;


    public Cat(String catName) {
        name = catName;
    }

    // Конструктор по умолчанию
    public Cat() {
    }

    //
    public Cat(String catName, String color) {
        name = catName;
        this.color = color;
    }

    public Cat(String name, String color, int age) {
 //       this(name, color);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void sleep() {
        System.out.println("I am sleep!");
    }

    public void run() {
        System.out.println("I am run!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void whoAmI() {
        System.out.printf("Я котик: %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }


}

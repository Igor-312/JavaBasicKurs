package lesson_23.abstracts;

abstract class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Cow eat");
    }
}
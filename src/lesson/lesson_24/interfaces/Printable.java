package lesson.lesson_24.interfaces;

public interface Printable {
    // Интерфейс - это совокупность абстрактных методов, задающих поведение

    // Все методы интерфейса косвенно и абстрактные, и публичные
    // public abstract
    void print();

    // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)
    default void test(){
        System.out.println("Test");
    }

    // Начиная с JDK8 доступны статические методы
    static void testStatic(String str) {
        System.out.println("Static method printable: " + str);
    }

    // c JDK 9 появились приватные методы (могут быть статические и нестатические).
    // Переопределить их в классе невозможно.
}
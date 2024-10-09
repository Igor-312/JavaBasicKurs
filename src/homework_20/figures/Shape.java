package homework_20.figures;

/*
Task 1
Иерархия классов “Фигуры”
Создайте программу, которая демонстрирует наследование с использованием классов геометрических фигур.
Базовый класс Shape
• Создайте класс Shape. • Добавьте поле name типа String, которое хранит название фигуры. • Создайте
метод displayInfo(), который выводит на экран значение поля name.
 */
public class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Фигура: " + name);
    }
}

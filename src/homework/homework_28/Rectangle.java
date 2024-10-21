package homework.homework_28;

import java.util.Objects;

/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:
    - length (длина) — тип double
    - width (ширина) — тип double
Требования:
Конструкторы:
   - Создайте конструктор, который инициализирует оба поля класса.
   - Создайте конструктор без параметров (по умолчанию), который устанавливает длину и ширину в
   значение 1.0.
Методы:
   - Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
   - Переопределите метод toString(), чтобы он возвращал строковое представление объекта Rectangle в
   формате: "Прямоугольник [длина=..., ширина=...]".
Метод main():
   - В методе main() создайте несколько объектов Rectangle и выведите их на экран, используя метод
   toString().

Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение объектов на равенство по
их содержимому.
Требования:
Переопределение метода equals():
    - Переопределите метод equals() в классе Rectangle, чтобы два объекта считались равными, если у них
    совпадают значения полей length и width.
Метод main():
- Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину и ширину.
- Сравните объекты между собой, используя метод equals(), и выведите результаты сравнения на экран.
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
      //  if (obj == null || getClass() != obj.getClass()) return false; // вариант 2.
        Rectangle rectangle = (Rectangle) obj;

        return Objects.equals(length, rectangle.length) &&
                Objects.equals(width, rectangle.width);

    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Прямоугольник {" +
                "длинна = " + length +
                ", ширина = " + width +
                '}';
    }
}









package homework_20.figures;

/*
Класс Main
• В методе main создайте объекты классов Rectangle и Circle. • Установите значения для их полей с помощью
соответствующих методов. • Установите имя фигуры, используя поле name, унаследованное от класса Shape.
• Вызовите метод displayInfo() и методы вычисления площади для каждого объекта, чтобы вывести информацию о
фигуре и её площади.
 */
public class MainApp {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle("Прямоугольник", 5, 10);
        rect.displayInfo();
        rect.calculateArea();

        Circle circle = new Circle("Круг", 3);
        circle.displayInfo();
        circle.calculateArea();
    }
}
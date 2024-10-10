package homework_20.figures;

/*
Класс Circle (Круг)
• Создайте класс Circle, который наследуется от Shape. • Добавьте поле radius типа double, которое хранит
радиус круга. • Создайте метод setRadius(double radius), который устанавливает значение поля radius.
• Создайте метод calculateArea(), который вычисляет и выводит площадь круга.
 */
public class Circle extends Shape {
    public static final double PI = 3.141519;

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Площадь круга: " + area);
    }
}
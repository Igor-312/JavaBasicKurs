package homework.homework_23.Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.type = "Круг";
    }

    @Override
    public double area() {
        return Math.PI * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

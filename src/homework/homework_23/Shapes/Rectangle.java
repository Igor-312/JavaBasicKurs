package homework.homework_23.Shapes;

public class Rectangle extends Shape {
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.type = "Прямоугольник";
    }

    @Override
    double area() {
        return weight * height;
    }

    @Override
    double perimeter() {
        return 2 * (weight * height);
    }
}

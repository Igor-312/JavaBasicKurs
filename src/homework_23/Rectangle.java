package homework_23;

public class Rectangle extends Shape {
    private double weight;
    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
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

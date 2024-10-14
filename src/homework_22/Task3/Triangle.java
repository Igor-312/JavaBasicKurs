package homework_22.Task3;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        System.out.print("Площадь треугольника: ");
        return 0.5 * base * height;
    }
}

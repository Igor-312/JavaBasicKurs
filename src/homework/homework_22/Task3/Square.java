package homework.homework_22.Task3;

public class Square extends Figure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        System.out.print("Площадь квадрата: ");
        return side * side;
    }
}

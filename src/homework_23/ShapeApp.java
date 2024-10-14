package homework_23;

import java.awt.geom.Area;

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.++
Реализуйте классы-наследники Circle, Rectangle, и Triangle.++
Убедитесь, что все классы правильно вычисляют площадь и периметр.++
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
public class ShapeApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(6);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Triangle(3, 3, 5);


        for (Shape shape : shapes) {
            System.out.println("Площадь фигуры: " + shape.area());
            System.out.println("Периметр фигуры: " + shape.perimeter());
        }
        System.out.println("\n===================\n");

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
            totalPerimeter += shape.perimeter();
        }

        System.out.println("Общая площадь: " + totalArea);
        System.out.println("Общий периметр: " + totalPerimeter);
    }
}

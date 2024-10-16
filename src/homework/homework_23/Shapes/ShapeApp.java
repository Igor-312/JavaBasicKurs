package homework.homework_23.Shapes;

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.++
Реализуйте классы-наследники Circle, Rectangle, и Triangle.++
Убедитесь, что все классы правильно вычисляют площадь и периметр.++
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
public class ShapeApp {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3,4,5);
        // Стороны по умолчанию - 3, 4, 5
        System.out.println(triangle);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(5, 7, 9);
        shapes[1] = new Circle(5.5);
        shapes[2] = new Rectangle(10, 20);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.print(shape.getClass().getSimpleName() + " площадь: " + shape.area());
            System.out.println("; периметр: " + shape.perimeter());

            sumArea += shape.area();
            sumPerimeter += shape.perimeter();
            System.out.println("================\n");
        }

        System.out.printf("Сумма площадей фигур: %.2f\n", sumArea);
        System.out.printf("Сумма периметров фигур: %.2f\n", sumPerimeter);



    }

}
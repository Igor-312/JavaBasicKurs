package homework.homework_22.Task3;

public class FigureApp {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(7);
        figures[1] = new Square(8);
        figures[2] = new Triangle(4,9);

        for (Figure figure : figures){
            System.out.println(figure.calculateArea());
        }
    }
}

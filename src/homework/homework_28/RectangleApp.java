package homework.homework_28;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3.5,3.5);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println("\n ============================== \n");

        Rectangle rect = new Rectangle(5.0,3.0);
        Rectangle rect1 = new Rectangle(5.0,3.0);
        Rectangle rect2 = new Rectangle(2.0,4.0);

        System.out.println(rect.equals(rect1));
        System.out.println(rect.equals(rect2));
    }
}

package homework_22.Task3;

public class Circle extends Figure{
   private double radius;

   public Circle(double radius){
       this.radius = radius;
   }

    @Override
    double calculateArea() {
        System.out.print("Площадь круга: ");
        return Math.PI * radius * radius;
    }
}

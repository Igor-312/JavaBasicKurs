package lesson_19;

import lesson_18.Car;

public class MainApp {
    public static void main(String[] args) {


        FinalDemo finalDemo = new FinalDemo(50);

        FinalDemo finalDemo1 = new FinalDemo();

        final Car car = new Car("BMW", 200);
       // car = new Car("VW", 100);

        car.setPowerPS(800);
        System.out.println(car.toString());

        System.out.println(FinalDemo.PI);

        System.out.println(FinalDemo.COUNTRY.toUpperCase());
        System.out.println("Country: " + FinalDemo.COUNTRY);

        System.out.println("\n ================== \n");

        System.out.println("finalDemo.getPiX(): " + finalDemo.getPiX());

    }
}

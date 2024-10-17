package homework.homework_23.Shapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = "Треугольник";
    }

//    if (!isValidSides()) {
//        // Стороны не правильные. Построить такой треугольник невозможно
//        System.out.println("Построить треугольник с такими сторонами невозможно");
//        // Todo Надо выбросить ошибку или закрыть конструктор
//        // ЕУстанавливаем для сторон значения "по умолчанию"
//        this.a = 3;
//        this.b = 4;
//        this.c = 5;
//    }


//        if(isValidSides()) {
//            //правда
//        } else {
//            // не правда
//            // Код обработки не верных сторон
//        }
//
//        if( !true ) { // Если не правда
//            // В этом блоке, обрабатываю код, если метод вернул false
//        } else {
//            // Правда
//        }

    private boolean isValidSides(){
        return  a + b > c && a + c > b && b + c > a;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }

    @Override
    double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }


}

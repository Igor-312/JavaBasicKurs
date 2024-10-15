package homework_23.Shapes;

abstract class Shape {

    protected String type;

    public Shape() {
        this.type = "Форма";
    }

    abstract double area();

    abstract double perimeter();

    public String toString() {
        return type + " Площадь: " + area() + ", периметр " + perimeter();
    }

}

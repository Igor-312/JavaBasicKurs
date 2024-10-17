package homework.homework_22.Task2;

/*
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский
класс), Car, Bicycle и Motorcycle (дочерние классы). ++
Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь
реализации. ++
Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для
запуска соответствующего типа двигателя (если есть). ++?
Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова
метода startEngine() для каждого транспортного средства. ++?
 */
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}

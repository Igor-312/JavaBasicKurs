package homework_20.device;

/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет один родительский
клас и два наследника, расширяющих его функционал
У родительского класса должен быть метод создающий строку с информацией об объекте (метод
String toString())
 */
public class Device {
    private String name;
    private String manufacturer;

    public Device(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String toString() {
        return "Имя устройства: " + name + ", производитель: " + manufacturer;
    }


}

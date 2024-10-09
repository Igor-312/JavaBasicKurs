package homework_20.device;

public class Smartphone extends Device{

    private double screenSize;

    public Smartphone(String name, String manufacturer, double screenSize) {
        super(name, manufacturer);
        this.screenSize = screenSize;
    }

    public String toString(){
        return super.toString() + ", размер экрана: " + screenSize;
    }
}

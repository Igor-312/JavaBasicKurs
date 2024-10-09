package homework_20.device;

public class MainApp {
    public static void main(String[] args) {
        Smartphone smartPhone = new Smartphone("Samsung Galaxy S24 Ultra", "SAMSUNG", 6.9);
        Notebook noteBook = new Notebook("LIFEBOOK T Series", "FUDJITSU", 6);

        System.out.println(smartPhone);
        System.out.println(noteBook);
    }
}

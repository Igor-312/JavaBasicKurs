package homework_20.device;

public class Notebook extends Device{

    private int processorCores;

    public Notebook(String name, String manufacturer, int processorCores) {
        super(name, manufacturer);
        this.processorCores = processorCores;
    }

    public String toString() {
        return super.toString() + ", количество ядер в процессоре: "  + processorCores;
    }
}

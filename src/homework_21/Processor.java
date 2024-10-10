package homework_21;

public class Processor extends Component {
    private Computer computer;

    public Processor(String brand, String model) {
        super(brand, model);
    }

    public void setComputer(Computer computer) {
        if (computer == null) {
            return;
        }
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }
}

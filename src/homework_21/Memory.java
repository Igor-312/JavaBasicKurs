package homework_21;

public class Memory extends Component {
    private Computer computer;

    public Memory(String brand, String model) {
        super(brand, model);
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        if (computer == null) {
            return;
        }
        this.computer = computer;
    }
}

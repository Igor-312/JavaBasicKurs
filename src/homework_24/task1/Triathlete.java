package homework_24.task1;

public class Triathlete implements Swimmer, Runner {

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " занимается бегом!");
    }

    @Override
    public void swim() {
        System.out.println(name + " занимается плаваньем!");
    }
}

package homework.homework_22.Task1;

public class Human {

    private int runSpeed;
    private int restTime;

    private String typeRunner = "Человек";

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч \n", typeRunner, runSpeed);
        rest();
    }

    public void rest() {
        System.out.printf("%s нужен отдых %d минут\n", typeRunner, restTime);
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }
}

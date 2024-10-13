package homework_22.Task1;

public class AmateurAthlete extends Human {
    @Override
    public void run() {
        System.out.println("Спортсмен-любитель бежит со скоростью 15 км/ч");
    }

    @Override
    public void rest() {
        System.out.println("Спортсмену-любителю нужен отдых 10 минут");
    }
}

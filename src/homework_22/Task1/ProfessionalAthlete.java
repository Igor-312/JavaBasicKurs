package homework_22.Task1;

public class ProfessionalAthlete extends Human {
    @Override
    public void run() {
        System.out.println("Спортсмен-профи бежит со скоростью 25 км/ч");
    }

    @Override
    public void rest() {
        System.out.println("Спортсмену-профи нужен отдых 5 минут");
    }
}

package lesson.lesson_17;

public class Auto {

    void gas() {

        System.out.println("Авто едет вперед");
    }

    void breakMe() {


        System.out.println("Авто замедляется");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.gas();
        auto.breakMe();
    }

}

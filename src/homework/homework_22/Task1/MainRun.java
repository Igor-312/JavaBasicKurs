package homework.homework_22.Task1;

/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи. ++
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человеку нужен отдых после пробежки 15 минут, любитель
10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class MainRun {
    public static void main(String[] args) {
        Human person = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();


        person.run();
        amateurAthlete.run();
        professionalAthlete.run();
    }
}

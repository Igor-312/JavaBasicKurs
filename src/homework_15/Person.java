package homework_15;
/*
Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.
Не забудьте использовать абстракцию.
Например, опишите студента, преподавателя и, допустим, врача.
Вы можете выбрать свои сущности для описания.
 */
public class Person {
    String name;
    String profession;
    int age;


//    public Person(String personName) {
//        name = personName;
//    }
//
//    //  Конструктор (нужен или нет ВОПРОС)
//    public Person() {
//    }

    public Person(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public void whoAmI() {
        System.out.printf("Моё имя: %s, мой возраст: %d, моя профессия: %s\n", name, age, profession);
    }

}

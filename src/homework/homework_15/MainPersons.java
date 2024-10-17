package homework.homework_15;

public class MainPersons {
    public static void main(String[] args) {

        Person person1 = new Person("Alex", "Teacher", 35);
        person1.whoAmI();

        Person person2 = new Person("Elias", "Doctor", 29);
        person2.whoAmI();

        Person person3 = new Person("Melanie", "Manager", 31);
        person3.whoAmI();
    }
}

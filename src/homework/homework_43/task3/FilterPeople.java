package homework.homework_43.task3;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше
определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */
public class FilterPeople {
    public static List<Person> filterPeople(List<Person> people, int minAge, String city) {
        return people.stream()
                .filter(person -> person.getAge() > minAge)
                .filter(person -> person.getCity().equals(city))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Max", 16, "Cologne"),
                new Person("Sten", 22, "Berlin"),
                new Person("Richard", 42, "Berlin"),
                new Person("Eva", 26, "Berlin"),
                new Person("Kristian", 29, "Munich"),
                new Person("Muhamed", 25, "Berlin"),
                new Person("Jalil", 35, "Berlin")
        );
        List<Person> filteredPeople = filterPeople(people, 25, "Berlin");

         filteredPeople.forEach(System.out::println);
        // System.out.println(filteredPeople);
    }
}

package consultation_11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception {

        Person person = new Person("Johan");

        // Находим приватное поле с именем "name"
        Field nameField = Person.class.getDeclaredField("name");

        // Произношу заклинание
        nameField.setAccessible(true);

        // Меняем значение
        nameField.set(person, "Мария");

        System.out.println("Новое имя: " + nameField.get(person));

        nameField.setAccessible(false);

        // Находим приватный метод
        Method seyHelloMethod = Person.class.getDeclaredMethod("sayHello");

        seyHelloMethod.setAccessible(true);

        seyHelloMethod.invoke(person);

        Method testMethod = Person.class.getDeclaredMethod("test", String.class);

        testMethod.setAccessible(true);
        testMethod.invoke(person, "Java");


    }
}

package homework.homework_30.password;

import lesson.lesson_30.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Берем валидный email
    2. Устанавливает сеттером валидный email person
    3. Мы ожидаем: что у person в поле email будет валидный email, который мы установили на шаге 2
    4. Проверить равенство person.getEmail() с валидным email, который мы устанавливали
    */
    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);
        System.out.println("getEmail: " + person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берем не валидный email
    2. Устанавливаем сеттером не валидный email person-у
    3. Ожидаем результат:
    1) Email установлен не будет. Т.е. значение email у person не будет равно не валидному email
    2) Значение поля email у person останется прежним
     */

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmail(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
        Assertions.assertEquals(startEmail, person.getEmail());
    }


    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mail@.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "t#est@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-test@mail.net",
                ".test@mail.net",
                "test+1@mail.net"
        );
    }


    /*
    Task 1
    Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
    */

    @Test
    void testValidPasswordSet() {
        String validPass = "Password123!";

        person.setPassword(validPass);
        System.out.println("validPass: " + person.getPassword());
        Assertions.assertEquals(validPass, person.getPassword());
    }

    @ParameterizedTest
    @MethodSource("invalidPassword")
    void testInvalidPassword(String invalidPass) {
        person.setPassword(invalidPass);
        Assertions.assertNotEquals(invalidPass, person.getPassword());
        Assertions.assertEquals(startPassword, person.getPassword());
    }

    static Stream<String> invalidPassword() {
        return Stream.of(
                "Pass12!",
                "Password!",
                "PASSWORD123!",
                "password123!",
                "Password123"
        );
    }

}

/*
Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */

/*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */
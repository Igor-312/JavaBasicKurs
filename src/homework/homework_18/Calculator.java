package homework.homework_18;
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять
базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:
Статические методы для каждой математической операции, принимающие два аргумента и
возвращающие результат операции.
 */
public class Calculator {
    // сложение
    static double add(double a, double b) {
        return a + b;
    }
    // вычитание
    static double subtract(double a, double b) {
        return a - b;
    }
    // умножение
    static double multiply(double a, double b) {
        return a * b;
    }
    // деление
    static double divide(double a, double b) {
        if (b == 0) {
            return Integer.MIN_VALUE;
        }
       return a / b;
    }

}

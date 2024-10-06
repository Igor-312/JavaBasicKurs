package homework_17;
/*
Инкапсулировать класс нашего магического массива
 */

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter Schumacher", 45, 20_000);
        System.out.println(employee.Info());
    }
}

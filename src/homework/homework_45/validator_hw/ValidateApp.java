package homework.homework_45.validator_hw;


public class ValidateApp {
    public static void main(String[] args) {

        // Получаем email от пользователя (Сканером, из другого слоя приложения).
        String email = "test@email.com";
        String password = "Wqe@123!";

        // Валидация email
        try {
            UserValidator.isEmailValid(email);
            // Если мы дойдем до этой строчки кода,
            // значит email валидный
            System.out.println("Email прошел проверку");

            UserValidator.isPasswordValid(password);
            System.out.println("Password is valid");
            // User user = new User(email, password)
        } catch (EmailValidateException e) {
            // Email не прошел проверку.
            // Запросить у пользователя другой ввод
            System.out.println("Email is not valid");
            String message = e.getMessage();
            System.out.println(message);
        } catch (PasswordValidateException ex) {
            System.out.println("Password is not valid");
            System.out.printf(ex.getMessage());
        }

//        try {
//            UserValidator.isPasswordValid(password);
//            System.out.println("Password is valid");
//        } catch (PasswordValidateException error) {
//            System.out.println("Password is not valid");
//        }
        // Когда
    }
}

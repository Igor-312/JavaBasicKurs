package homework.homework_44.task4option;

import java.util.List;
import java.util.Optional;

/*
Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User>
и int id.
Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть
Optional.empty().
Подсказка:
Используйте Optional.of(user) или Optional.empty().
 */
public class UserApp {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Igor"),
                new User(2,"Viktoria"),
                new User(3, "Max")
        );

        Optional<User> user = findUserById(users,2);
        user.ifPresent(u -> System.out.println("User: " + u.getName()));

        Optional<User> user2 = findUserById(users,4);
        System.out.println("User XXX: " + user2.isPresent());

    }
    public static Optional<User> findUserById(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}

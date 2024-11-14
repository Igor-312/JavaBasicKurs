package homework.homework_46;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
Task 1
Получить и вывести на экран:
текущую дату ++
текущий год, месяц и день ++
Создать дату, например Ваш день рождения и вывести на экран ++
Создать две даты и проверить на равенство ++
Получить и вывести на экран:
текущее время ++
текущее время + 3 часа ++
Создать дату:
которая на неделю позже сегодняшней ++
которая была на год раньше сегодняшней используя метод minus ++
которая на год позже сегодняшней ++
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней ++
 */
public class Task1 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        System.out.println("=========================");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String strDate = now.format(formatter);
        System.out.println("Текущий год, месяц и день: " + strDate);

        System.out.println("=========================");

        LocalDate birthday = LocalDate.of(1984, 6, 8);
        System.out.println("Мой день рождения: " + birthday);

        System.out.println("=========================");

        LocalDate date1 = LocalDate.of(2024, 11, 14);
        LocalDate date2 = LocalDate.of(2024, 11, 13);
        boolean isEqual = date1.isEqual(date2);
        System.out.println("Дата 1 и дата 2 равны: " + isEqual);

        System.out.println("=========================");

        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);
        LocalTime timePlus = currentTime.plusHours(3);
        System.out.println("Текущее время +3 часа: " + timePlus);

        System.out.println("=========================");

        LocalDate weekLater = currentDate.plusWeeks(1);
        System.out.println("Дата, которая на неделю позже сегодняшней : " + weekLater);

        System.out.println("=========================");

        LocalDate yearLater = currentDate.minus(1, ChronoUnit.YEARS);
        System.out.println("Дата, которая была на год раньше сегодняшней: " + yearLater);

        System.out.println("=========================");

        LocalDate yearPlus = currentDate.plusYears(1);
        System.out.println("Дата, которая на год позже сегодняшней: " + yearPlus);

        System.out.println("=========================");

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("Завтра: " + tomorrow + ", Вчера: " + yesterday);

        System.out.println("Находится позже сегодняшней: " + tomorrow.isAfter(currentDate));
        System.out.println("Находится раньше сегодняшней: " + yesterday.isBefore(currentDate));

    }

}

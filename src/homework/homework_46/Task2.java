package homework.homework_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между самой
ранней и поздней датами в этом списке
 */
public class Task2 {
    public static long daysBetween(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не может быть пустым.");
        }

        LocalDate minDate = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate maxDate = dates.stream().max(LocalDate::compareTo).orElseThrow();

        return ChronoUnit.DAYS.between(minDate, maxDate);
    }

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2024, 1, 15),
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2024, 3, 25)
        );

        System.out.println("Количество дней между самой ранней и поздней датой: " + daysBetween(dates));
    }


}

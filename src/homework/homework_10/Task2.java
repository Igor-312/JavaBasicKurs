package homework.homework_10;

/*
Task 2
Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий
из самой короткой и самой длинной строки изначального массива.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[] strings = {"One", "Java", "Python", "JS", "hello"};
        String[] result = getArrayWithSmallestString(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("\n ==== testArray = null / length = 0 =============");
        strings = null;
        //      strings = new String[0];
        String[] res = getArrayWithSmallestString(strings);

        System.out.println("\n =========== null in array =============\n");

        strings = new String[]{"One1", "Java", null, "JS", "hello"};
        res = getArrayWithSmallestString(strings);
        System.out.println();

        System.out.println(Arrays.toString(res));

        System.out.println("\n =========== null in array is First =============\n");
        strings = new String[]{null, "Java", "Python", null, "JS", "hello"};
//        strings = new String[]{ null, null, null, null, null};
        System.out.println(Arrays.toString(strings));
        res = getArrayWithSmallestString(strings);

        System.out.println(Arrays.toString(res));

    } // Methods area

    public static String[] getArrayWithSmallestString(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0];
        }
// Попытаться присвоить в строки не null

        String notNutValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNutValue: " + notNutValue);
        if (notNutValue == null) {
            return new String[0];
        }


        String smallest = notNutValue;
        String biggest = notNutValue;


        for (int i = 1; i < strings.length; i++) {
            // {null, "Java", Python", null, "JS", "hello"};
            // i = 1
            System.out.print(strings[i] + "; ");
            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }

            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }
        return new String[]{smallest, biggest};
    }

    public static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }

        }
        // Если мы перебрали все элементы массива и не нашли не Нуль значение, возвращаем из метода
        return null;
    }

}

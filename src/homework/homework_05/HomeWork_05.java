package homework.homework_05;

import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {

        // Task 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String input = scanner.nextLine();

        System.out.println("Количество строк в имени пользователя: " + input.length());

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);

        System.out.println(firstChar + " | " + firstChar);
        System.out.println(lastChar + " | " + lastChar);

        // Task 2

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String str6 = " ";
        // Var1
        String concatStr = str1 + str6 + str2 + str6 + str3 + str6 + str4 + str6 + str5;
        System.out.println(concatStr + "; длинна " + concatStr.length());
        // Var2
        String concatStr1 = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println(concatStr1 + "; длинна " + concatStr.length());

        // Task 2.2

        String result = concatStr.replace("powerful", "super");
        System.out.println(result);

        String replaceMe = "AbAbAbAc";
        String replace1 = replaceMe.replaceFirst("Ab", "C");
        String replace2 = replaceMe.replace("Ab", "D");
        String replace3 = replaceMe.replaceAll("Ab", "E");

        System.out.println("replace1: " + replace1);
        System.out.println("replace2: " + replace2);
        System.out.println("replace3: " + replace3);

        // Поиск индекса
        int index = concatStr.indexOf("age");
        System.out.println("index: " + index);

        // replaceMe = "AbAbAbAc";
        int indexAb1  = replaceMe.indexOf("Ab");
        System.out.println("indexAb1: " + indexAb1);
        int indexAb2  = replaceMe.lastIndexOf("Ab");
        System.out.println("indexAb2: " + indexAb2);



    }
}

package lesson_05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java"; //Объявление и инициализация переменной типа String.

        String string1 = new String("Hallo"); // Нерекомендуемый

        System.out.println(string);

        int length = string.length();
        System.out.println("length: " + length);

        // Метод позволяет перевести все символы строки в верхний регистр
        System.out.println(string.toUpperCase());
        System.out.println("string: " + string);

        // String иммутабельна (неизменна)
        // Если я хочу сохранить результат работы метода - я должен сохранить его в какую-то переменную
        String stringUpper = string.toUpperCase();

        System.out.println("stringUpper: " + stringUpper);
        System.out.println("string: " + string);

        // toLowerCase() - переводит все символы строки в нижний регистр
        // Результат работы метода мы можем сохранить в ту же самую переменную.
        stringUpper = stringUpper.toLowerCase();
        System.out.println("StringUpper: " + stringUpper);

        System.out.println(" ====================== \n");

        String str1 = "One";
        String str2 = " ";
        String str3 = "Hello";

        // Различные варианты конкатенации (склеивание \ объединение) строк

        // Конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        // Конкатенация 2
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2: " + concatStr2);


        String concatStr3 = str1.concat(str2).concat(str3).concat("!");
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3

        String concatStr4 = str1 + " " + str3 + " " + "java";
        System.out.println("concatStr4: " + concatStr4);
        concatStr4 = String.join(" - ", str1, str3, "java");
        System.out.println("concatStr4: " + concatStr4);

        // Приведение типов. Когда есть строка - знак плюс - это знак конкатенации.
        int id = 1;
        int id2 = 2;
        String string2 = "Hello" + id + id2;
        System.out.println("string2: " + string2); //

        string2 = "Hello" + (id + id2);
        System.out.println("string2: " + string2);

        System.out.println("My age is: " + id2);

        System.out.println("===================\n");
        String digits = "0123456789";
        System.out.println("digits.length: " + digits.length());
        //
        char firstChar = digits.charAt(0); // взять символ под номером 0 из строки digits
        // Независимо от фактической длинны строки, индекс последнего символа ВСЕГДА будет равен (длинна -1)
        char lastChar = digits.charAt(digits.length() - 1); //

        System.out.println("firstChar: " + firstChar);
        System.out.println(digits.charAt(4));
        System.out.println("lastChar: " + lastChar);

        System.out.println("===================\n");
        String subString = digits.substring(2); // Выделить...
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits);

        String subString2 = digits.substring(2, 7);
        System.out.println("subString2: " + subString2);
    }
}

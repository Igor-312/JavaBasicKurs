package lesson.lesson_04;

public class TypeCharExample {
    public static void main(String[] args) {
        char a = 'A';
        char a1 = 65;
        char a2 = 0x41;
        a2 = 0x0041;
        char a3 = '\u0041';
        char x = '\u15D7';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);


        char digit0 = 48;
        System.out.println("digit0: " + digit0);

        //  digit0 = (char) (digit0 + 5);

        digit0 += 5;  //   var = var + 5; to je samoe
        System.out.println("digit0: " + digit0);

        char letter = 97;
        System.out.println("letter: " + letter);
        letter++;
        System.out.println("letter: " + letter);

        System.out.println("int iz char dast 10-i kod simvola: " + (int) letter);
        System.out.println(0 + letter);


        char x1 = 12853;
        System.out.println(x1);





    }
}

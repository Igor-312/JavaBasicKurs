package lesson_25;

public class Wrappers {
    public static void main(String[] args) {


        Integer wrapperInt = 5;
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;

        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b -> " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d -> " + (c == d));
        System.out.println("c.equals(d): " + c.equals(d));

        String j1 = "Java";
        String j2 = "Java";
        System.out.println("j1 == j2 -> " + (j1 == j2));
        String j3 = new String("Java");

        System.out.println("j2 == j3 ->" + (j2 == j3));
        System.out.println("j3.equals(j2): " + j3.equals(j2));

        System.out.println("\n =============================== \n");

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);


        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("e == f -> " + (e == f));


        Integer intStr = Integer.valueOf(123);
        System.out.println(intStr + 100);

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("345.67");


    }

}

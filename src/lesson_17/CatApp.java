package lesson_17;

public class CatApp {
    public static void main(String[] args) {
        Cat17 cat = new Cat17("Kitty", 8, 5);

        cat.sayMeow();

        System.out.println(cat.toString());

 //       cat.age = -1000;

//        cat.weight = 1500;
//
//        cat.name = null;

        String name = cat.getName();
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Вес: " + cat.getWeight());

        cat.setAge(1500);
        cat.setName("Max");

        System.out.println(cat.toString());

        System.out.println(" =============== \n");
    }
}

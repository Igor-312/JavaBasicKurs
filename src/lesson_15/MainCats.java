package lesson_15;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat();


//        cat.sayMeow();
//        cat.run();
//        cat.sleep();

        String catName = cat.name;
        System.out.println("Name Cat: " + catName);

        System.out.println("Age: " + cat.age);

        System.out.println("===================\n");

        Cat cat1 = new Cat("Tom");

        System.out.println("Color: " + cat1.color);
        System.out.println("Name Cat: " + cat1.name);

        System.out.println("=====================\n");
        Cat cat2 = new Cat("Tomas", "Red");

        cat2.whoAmI();
        System.out.println("=====================\n");
        Cat barsik = new Cat("Barsik", "White", 3);
        barsik.whoAmI();

    }
}

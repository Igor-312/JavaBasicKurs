package lesson_16;

import lesson_15.Cat;

public class lesson16 {
    public static void main(String[] args) {

        Cat catVar = new Cat();

        catVar.whoAmI();
        System.out.println(catVar.name);
        catVar.name = "Jack";
        System.out.println(catVar.name);
        catVar.whoAmI();

        System.out.println("==================================\n");

        Cat barsik = new Cat("Barsik", "Grey", 4);
        barsik.whoAmI();
        System.out.println("name: " + barsik.name);
        System.out.println("color: " + barsik.color);
        System.out.println("age: " + barsik.age);
        barsik.age = 12;

        System.out.println("=================================\n");
        Cat cat1 = new Cat("Barsik", "Grey", 4);
        cat1.whoAmI();

        Cat catClone = cat1;
        catClone.whoAmI();

        cat1.age = 100;
        cat1.whoAmI();
        catClone.whoAmI();
        System.out.println(catClone.age);
        catClone.name = "Max";

        catClone.whoAmI();
        cat1.whoAmI();

        System.out.println("========================\n");

        catClone = new Cat("Tomas", "Black", 14);

        catClone.whoAmI();
        cat1.whoAmI();




    }
}

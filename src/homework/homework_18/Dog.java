package homework.homework_18;

/*
Task 2 * (Опционально)
Написать класс Собака (Dog).++
Каждая Собака обязательно должна иметь имя и высоту прыжка++
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.
Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно
проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */
public class Dog {

    String name;
    double jumpHeight;

    public Dog(String name, double jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void train() {
        if (jumpHeight < 10) {
            
        }
    }

}
package lesson.lesson_17;

public class Cat17 {
    private String name;
    private int age;
    private int weight;

    public Cat17(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age < 0 || age > 20) {
            return;
        }
        this.age = age;
    }

    public void setName(String name) {
        if (name == null) return;
        this.name = name;
    }

    private Cat17() {
    }

    private void testMethod() {
        System.out.println("Test");
    }

    void sayMeow() {
        System.out.println("Meow! " + name);
    }

    public String toString() {
        return "Cat " + name + ", age: " + age + ", weight " + weight;
    }
}

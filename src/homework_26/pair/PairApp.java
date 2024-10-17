package homework_26.pair;

/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.
Требования:
Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */
public class PairApp {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World", "Java");
        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());
        System.out.println("Третье значение: " + pair.getThird());

        System.out.println("\n ============================== \n");

        pair.swap();
        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());
        System.out.println("Третье значение: " + pair.getThird());

    }

}

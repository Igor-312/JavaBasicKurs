package homework.homework_26.task2;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists, который принимает два параметра типа MyArrayList
и MyArrayList, и выводит элементы обоих списков.
Требования:
Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
 */
public class MyArrayListApp {
    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        System.out.print("First list: ");
        for (T element : list1.toArray()) {
            System.out.print(element + ", ");
        }

        System.out.println("\n ========================== \n");

        System.out.print("Second list: ");
        for (U element : list2.toArray()) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        MyArrayList<String> words = new MyArrayList<>();
        words.add("Hello ");
        words.add("World ");
        words.add("Java!");

        printTwoLists(numbers, words);
    }


}

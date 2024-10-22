package lesson.lesson_29.iterators;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class ForEachExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        while (iterator.hasNext()) {
            String s = iterator.next();
        }

        System.out.println("=============");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
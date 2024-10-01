package lesson_16;

public class MagicArray {
    int[] array;
    int cursor;

    public MagicArray() {
        array = new int[10];
    }

    void add(int value) {

        if (cursor == array.length - 1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers) {

//        System.out.println("jffffffff " + numbers.length);
//        System.out.println("nbbbbbbbbb" + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }


    }

    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    int size() {
        return cursor;
    }

    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }

        return Integer.MIN_VALUE;
        //TODO

    }


    int remove(int index) {

    }


}

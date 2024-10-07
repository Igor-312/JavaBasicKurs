package homework_17;

/*
Task 1
Инкапсулировать класс нашего магического массива
 */
public class MagicArrayIncapsulated {
    private int[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    public MagicArrayIncapsulated() {
        array = new int[10];
    }

    // Добавление в массив одного элемента
    public void add(int value) {

        // Проверка. Есть ли вообще свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    public void add(int... numbers) {
        // с numbers я могу обращаться точно также, как со ссылкой на массив int
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        // System.out.println("Есть индекс у каждого инта, как в массиве. По индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }


    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1
        int[] newArray = new int[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // Переписываю все значения из старого массива в новый
        }

        // Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }

    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }

    // Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Написать код, если индекс "не корректный"
        return Integer.MIN_VALUE; // Хорошего решения нет.
        //Todo Поправить обработку не корректного индекса
    }

    // Удаление элемента по индексу
    public int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */
        //Todo реализовать
        return -1;
    }


    public int lastIndexOf(int value) {
        int index = -1;
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return index;
    }


}

/*
1. Добавлять в массив элемент (не думая об индексах, размере массива)
2. Динамическое изменение размера массива
3. Возвращать строковое представление массива (какие элементы тым есть)
4. Добавляем в массив сразу несколько значений.
5. Текущее количество элементов в массиве
6. Возвращает значение по индексу
7. Удаляет элемент по индексу (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)

 */
package homework_26.twolists;

public class MyArrayList<T> {
    private T[] elements;
    private int size;

    public MyArrayList() {
        elements = (T[]) new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    public int size() {
        return size;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        System.arraycopy(elements, 0, array, 0, size);
        return array;
    }

    private void resize() {
        T[] newArray = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }
}



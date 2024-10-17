package homework.homework_26.pair;

public class Pair<T> {
    private T first;
    private T second;
    private T third;

    public Pair(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = third;
        third = temp;
    }
}

package homework.homework_26.task3;

public class NumericPair<T extends Number> {
    private T first;
    private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

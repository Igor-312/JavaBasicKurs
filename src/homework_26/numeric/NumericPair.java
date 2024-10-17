package homework_26.numeric;

public class NumericPair<T extends Number> {
    private T first;
    private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public double sum(){
        return first.doubleValue() + second.doubleValue();
    }
}

package homework.homework_26.numeric;

public class NumericApp {
    public static void main(String[] args) {
        NumericPair<Integer> intPair = new NumericPair<>(2,10);
        System.out.println("Сумма целых чисел: " + intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 15.3);
        System.out.println("Сумма дробных чисел: " + intPair.sum());
    }
}

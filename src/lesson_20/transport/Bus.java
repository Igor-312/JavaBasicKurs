package lesson_20.transport;

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        super(model, year);
        this.capacity = capacity;
    }

    public boolean takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир вошел в автобус: " + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    private boolean dropPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобус: " + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше нет пассажиров.\n",
                this.getModel(), countPassengers);
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}

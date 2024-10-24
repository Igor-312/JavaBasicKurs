package homework.homework_31;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю
температуру для каждого времени года.
 */
public enum Season {
    WINTER("зима", -5),
    SPRING("весна", 15),
    SUMMER("лето", 30),
    AUTUMN("осень", 20);

    private String seasons;
    private int averageTemperature;

    Season(String seasons, int averageTemperature) {
        this.seasons = seasons;
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasons = '" + seasons + '\'' +
                ", averageTemperature = " + averageTemperature +
                '}';
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}

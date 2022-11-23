package Transport;

import java.util.Objects;

public class Train extends Transport {
    private float costRide;
    private final float timeRideHour;
    private final String startStation;
    private final String finalStation;
    private int countWagons;


    public float validateTimeRide(float value) {
        return value <= 0 ? 1 : Math.abs(value);
    }

    public float validateCostRide(float value) {
        return value <= 0 ? 100 : Math.abs(value);
    }

    @Override
    public void refill() {
        if (super.getRefill().equals("diesel")) {
            System.out.println("Заправляем поезд " + getBrand() + " " + getModel() + " дизельным топливом.");
        } else {
            System.out.println("Выберите правильную заправку");
        }
    }

    //Конструктор на случай добавления в параметры стоимости билета и времени поездки
    public Train(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, String refill, float costRide,
                 float timeRideHour, String startStation, String finalStation, int countWagons) {
        super(brand, model, yearOfRelease, country, color, maxSpeed, refill);
        this.costRide = validateCostRide(costRide);
        this.timeRideHour = validateTimeRide(timeRideHour);
        this.startStation = validateStringParameters(startStation);
        this.finalStation = validateStringParameters(finalStation);
        this.countWagons = validateNumParameters(countWagons);
    }

    public Train(String brand, String model, int yearOfRelease, String country, int maxSpeed, String refill,
                 String startStation, String finalStation, int countWagons) {
        super(brand, model, yearOfRelease, country, maxSpeed, refill);
        this.timeRideHour = 0;
        this.startStation = validateStringParameters(startStation);
        this.finalStation = validateStringParameters(finalStation);
        this.countWagons = validateNumParameters(countWagons);

    }

    public float getCostRide() {
        return costRide;
    }

    public void setCostRide(float costRide) {
        this.costRide = costRide;
    }

    public float getTimeRideHour() {
        return timeRideHour;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Float.compare(train.costRide, costRide) == 0 && Float.compare(train.timeRideHour, timeRideHour) == 0 && countWagons == train.countWagons && startStation.equals(train.startStation) && finalStation.equals(train.finalStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costRide, timeRideHour, startStation, finalStation, countWagons);
    }

    @Override
    public String toString() {
        return "ПОЕЗД: Марка: " + super.getBrand() + ", модель: " + super.getModel() + ", количество вагонов: " + getCountWagons() + ", станция отправления: " + getStartStation() +
                ", станция прибытия: " + getFinalStation() + ", количество вагонов " + getCountWagons() + ",\n год выпуска: " + super.getYear() +
                ", страна сборки: " + super.getCountry() + ", тип топлива: " + getRefill() + ", максимальная скорость " + getMaxSpeed() + " км/ч.";
    }


}

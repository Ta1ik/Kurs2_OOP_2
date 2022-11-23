package Transport;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private String refill;


    public abstract void refill();

    public String validateStringParameters(String value){
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }
    public int validateNumParameters(int value){
        return value == 0 ? 0 : Math.abs(value);
    }


    public Transport(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, String refill) {
        this.brand = validateStringParameters(brand);
        this.model = validateStringParameters(model);
        this.year = validateNumParameters(yearOfRelease);
        this.country = validateStringParameters(country);
        this.color = validateStringParameters(color);
        this.maxSpeed = validateNumParameters(maxSpeed);
        this.refill = validateStringParameters(refill);

    }
    public Transport(String brand, String model, int yearOfRelease, String country, int maxSpeed, String refill){
        this(brand, model, yearOfRelease, country, "",  maxSpeed, refill);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getRefill() {
        return refill;
    }

    public void setColor(String color) {
        validateStringParameters(this.color = color);
    }

    public void setMaxSpeed(int maxSpeed) {
        validateNumParameters(this.maxSpeed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && brand.equals(transport.brand) && model.equals(transport.model) && country.equals(transport.country) && color.equals(transport.color) && refill.equals(transport.refill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed, refill);
    }
}


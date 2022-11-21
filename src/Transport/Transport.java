package Transport;

public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed) {
        validateStringParameters(this.brand = brand);
        validateStringParameters(this.model = model);
        validateIntParameters(this.year = yearOfRelease);
        validateStringParameters(this.country = country);
        validateStringParameters(this.color = color);
        validateIntParameters(this.maxSpeed = maxSpeed);
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

    public void setColor(String color) {
        validateStringParameters(this.color = color);
    }

    public void setMaxSpeed(int maxSpeed) {
        validateIntParameters(this.maxSpeed);
    }

    public String validateStringParameters(String value){
        return value == null || !value.isBlank() || !value.isEmpty() ? "default" : value;
    }
    public int validateIntParameters(int value){
        return value == 0 ? 0 : Math.abs(value);
    }
}


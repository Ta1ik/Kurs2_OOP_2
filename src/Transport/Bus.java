package Transport;


public class Bus extends Transport {

    @Override
    public void refill() {
        if (super.getRefill().equals("benzine")) {
            System.out.println("Заправляем автобус " + getBrand() + " " + getModel() + " бензином.");
        } else if (super.getRefill().equals("diesel")) {
            System.out.println("Заправляем автобус " + getBrand() + " " + getModel() + " дизельным топливом.");
        } else {
            System.out.println("Выберите правильную заправку");
        }
    }

    public Bus(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, String refill) {
        super(brand, model, yearOfRelease, country, color, maxSpeed, refill);
    }

    @Override
    public String toString() {
        return "АВТОБУС: Марка: " + getBrand() + ", модель: " + getModel() + ", год выпуска: " + getYear() + ", страна производства: " + getCountry() +
                ", цвет: " + getColor() + ", тип топлива: " + getRefill() + ", максимальная скорость: " + getMaxSpeed() + "км/ч.";
    }
}



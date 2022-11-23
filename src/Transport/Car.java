package Transport;

import java.util.Objects;

import java.util.regex.Pattern;

public class Car extends Transport {

    private Float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tireIsSummer;

    @Override
    public void refill() {
        if(super.getRefill().equals("benzine")){
            System.out.println("Заправляем автомобиль " + getBrand() + " " + getModel() + " бензином.");
        } else if (super.getRefill().equals("diesel")){
            System.out.println("Заправляем автомобиль " + getBrand() + " "  + getModel() + "  дизельным топливом.");
        } else if (super.getRefill().equals("electro")){
            System.out.println("Заправляем автомобиль " + getBrand() + " "  + getModel() + " на электрозаправке.");
        } else {
            System.out.println("Выберите правильную заправку");
        }

    }

    //--------вложенный класс Key
    public class Key {
        private final String distanceStartEngine;
        private final String keylessEntry;

        public Key(String distanceStartEngine, String keylessEntry) {
            if (distanceStartEngine == null || distanceStartEngine.isEmpty()) {
                this.distanceStartEngine = "default";
            } else {
                this.distanceStartEngine = distanceStartEngine;
            }
            if (keylessEntry == null || keylessEntry.isEmpty()) {
                this.keylessEntry = "default";
            } else {
                this.keylessEntry = keylessEntry;
            }
        }

        public String getDistanceStartEngine() {
            return distanceStartEngine;
        }

        public String getKeylessEntry() {
            return keylessEntry;
        }
    }

    //--------вложенный класс Insurance
    public class Insurance {
        private final float periodInsurance;
        private final float costInsurance;
        private final String numberInsurance;

        public Insurance(float periodInsurance, float costInsurance, String numberInsurance) {
            this.periodInsurance = periodInsurance;
            if (costInsurance > 0) {
                this.costInsurance = 10250.43f;
            } else {
                this.costInsurance = costInsurance;
            }
            if (numberInsurance != null) {
                this.numberInsurance = numberInsurance;
            } else {
                this.numberInsurance = "default";
            }
        }

        public float getPeriodInsurance() {
            return periodInsurance;
        }

        public float getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void isValidInsurance() {
            if (periodInsurance == 0 || periodInsurance < 0) {
                System.out.println("Ваш страховой полис закончился. Необходимо срочно оформить новый полис!");
            } else {
                System.out.println("Срок действия вашего страхового полиса: " + periodInsurance);
            }
        }

        public void isValidNumberInsurance() {
            if (numberInsurance.length() == 9) {
                System.out.println("Номер вашего страхового полиса: " + numberInsurance);
            } else {
                System.out.println("Номер страхового полиса некорректный");
            }
        }
    }

    public void changeTire() {
        if (tireIsSummer) {
            tireIsSummer = false;
        } else if (!tireIsSummer) {
            tireIsSummer = true;
        }
    }

    public boolean testRegistrationNumber(String registrationNumber) {
        if (Pattern.matches("[а-яА-ЯaZA-Z0-9]{9}", registrationNumber)) {
            return true;
        } else {
            System.out.println("Неверно задан регистрационный номер");
            return false;
        }
    }

    //  Вариант №2
    public void validateRegistrationNumber() {
        boolean result = (registrationNumber.length() == 9);
        if (result) {
            for (int i = 0; i < registrationNumber.length(); i++) {
                char a1 = registrationNumber.charAt(i);
                if (a1 < 'а' && i < 1 || a1 > 'я' && i < 1 || a1 < 'а' && i > 3 && i < 6 || a1 > 'я' && i > 3 && i < 6) {
                    System.out.println("Символ под индексом: " + i + " введен некорректно.");
                }
                if (a1 < '0' && i >= 1 && i < 4 || a1 > '9' && i >= 1 && i < 4 || a1 < '1' && i >= 6) {
                    System.out.println("Символ под индексом: " + i + " введен некорректно.");
                }
            }
        }
    }


    public Car(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, float engineVolume, String transmission,
               String bodyType, String registrationNumber, int numberOfSeats, boolean tireIsSummer, String refill) {
        super(brand, model, yearOfRelease, country, color, maxSpeed, refill);
        this.engineVolume = validateFloatParameters(engineVolume);
        this.transmission = validateStringParameters(transmission);
        this.bodyType = validateStringParameters(bodyType);
        this.registrationNumber = validateStringParameters(registrationNumber);
        this.numberOfSeats = validateNumParameters(numberOfSeats);
        this.tireIsSummer = tireIsSummer;

    }

    public float validateFloatParameters(float value) {
        return value == 0f ? 1.5f : Math.abs(value);
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isTireIsSummer() {
        return tireIsSummer;
    }

    public void setTireIsSummer(boolean tireIsSummer) {
        this.tireIsSummer = tireIsSummer;
    }

    public static void separator() {
        System.out.println("________________________");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfSeats == car.numberOfSeats && tireIsSummer == car.tireIsSummer && engineVolume.equals(car.engineVolume) && transmission.equals(car.transmission) && bodyType.equals(car.bodyType) && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, transmission, bodyType, registrationNumber, numberOfSeats, tireIsSummer);
    }

    @Override
    public String toString() {
        return "АВТОМОБИЛЬ: Марка: " + super.getBrand() + ", модель: " + super.getModel() + ", объем двигателя: " + engineVolume + ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType + ", количество мест " + numberOfSeats + ", цвет: " + super.getColor() + ",\n регистрационный номер " + registrationNumber +
                ", год выпуска: " + super.getYear() + ", страна сборки: " + super.getCountry() + ", резина летняя: " + tireIsSummer + ", максимальная скорость " + getMaxSpeed() + " км/ч.";
    }

}



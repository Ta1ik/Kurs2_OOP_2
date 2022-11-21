package Transport;

public class Car {
    private final String brand;
    private final String model;
    private Float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tireIsSummer;

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
            if (costInsurance == 0 && costInsurance > 0) {
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

        public void isValidInsurance(){
            if(periodInsurance == 0 || periodInsurance < 0) {
                System.out.println("Ваш страховой полис закончился. Необходимо срочно оформить новый полис!");
            } else {
                System.out.println("Срок действия вашего страхового полиса: " + periodInsurance);
            }
        }
        public void isValidNumberInsurance(){
            if (numberInsurance.length() == 9){
                System.out.println("Номер вашего страхового полиса: " + numberInsurance);
            } else {
                System.out.println("Номер страховки некорректный");
            }
        }
    }


    public Car(String brand, String model, Float engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean tireIsSummer) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = Math.abs(year);
        }
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || transmission.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.tireIsSummer = tireIsSummer;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public void changeTire() {
        if (tireIsSummer) {
            tireIsSummer = false;
        } else if (!tireIsSummer) {
            tireIsSummer = true;
        }
    }

    public void testRegistrationNumber() {
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

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume + ", коробка передач: " + transmission +
                ", тип кузова: " + bodyType + ", количество мест " + numberOfSeats + ", цвет: " + color + ",\n регистрационный номер " + registrationNumber +
                ", год выпуска: " + year + ", страна сборки: " + country + ", резина летняя: " + tireIsSummer + ".";
    }

}



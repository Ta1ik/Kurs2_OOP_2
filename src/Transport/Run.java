package Transport;

public class Run {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "Желтый", 160 ,
                1.7f, "механическая", "седан", "а001аа001", 5,false);
        Car.Key ladaKey = lada.new Key("no","no");
        Car.Insurance ladaInsurance = lada.new Insurance(0f, 6555.50f, "A200B1001");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 280,
                3.0f, "автоматическая", "седан", "в302вв202",4, true);
        Car.Key audiKey = audi.new Key("yes", "yes");
        Car.Insurance audiInsurance = audi.new Insurance(1.5f, 50750.23f, "B100A01");

        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 320,
                3.0f, "автоматическая", "купе","0203004s0", 2, true);
        Car.Key bmwKey = bmw.new Key("yes", "yes");
        Car.Insurance bmwInsurance = bmw.new Insurance(2.7f, 32700f, "C3000F102");

        Car kia = new Car("KIA", "Sportage 4", 2018, "Южная Корея", "Красный",180 ,
                2.4f,"автоматическая", "кроссовер", "м104мм014", 5, false);
        Car.Key kiaKey = kia.new Key("yes", "");
        Car.Insurance kiaInsurance = kia.new Insurance(0.1f, 12307.35f, "H5232B001");

        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная корея", "Оранжевый",180,
                1.6f, "автоматическая", "седан", "о555оо105", 5, false);
        Car.Key hyundaiKey = hyundai.new Key(null,"yes");
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(2f, 10730.1f, "77B78FA22019");

        System.out.println(lada);
        Car.separator();
        audi.changeTire();
        System.out.println(audi);
        Car.separator();
        System.out.println(bmw);
        bmw.testRegistrationNumber();
        Car.separator();
        System.out.println(kia);
        Car.separator();
        System.out.println(hyundai);
        Car.separator();
        System.out.println("Наличие автозапуска у hyundai: " + hyundaiKey.getDistanceStartEngine() + ".");
        ladaInsurance.isValidInsurance();
        hyundaiInsurance.isValidNumberInsurance();
        bmwInsurance.isValidNumberInsurance();


    }

}

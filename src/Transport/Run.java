package Transport;

public class Run {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "Желтый", 160,
                1.7f, "механическая", "седан", "а001аа001", 5, false, "benzine");
        Car.Key ladaKey = lada.new Key("no", "no");
        Car.Insurance ladaInsurance = lada.new Insurance(0f, 6555.50f, "A200B1001");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 280,
                3.0f, "автоматическая", "седан", "в302вв202", 4, true, "diesel");
        Car.Key audiKey = audi.new Key("yes", "yes");
        Car.Insurance audiInsurance = audi.new Insurance(1.5f, 50750.23f, "B100A01");

        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 320,
                3.0f, "автоматическая", "купе", "0203004s0", 2, true, "benzine");
        Car.Key bmwKey = bmw.new Key("yes", "yes");
        Car.Insurance bmwInsurance = bmw.new Insurance(2.7f, 32700f, "C3000F102");

        Car kia = new Car("KIA", "Sportage 4", 2018, "Южная Корея", "Красный", 180,
                2.4f, "автоматическая", "кроссовер", "м104мм014", 5, false, "diesel");
        Car.Key kiaKey = kia.new Key("yes", "");
        Car.Insurance kiaInsurance = kia.new Insurance(0.1f, 12307.35f, "H5232B001");

        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная корея", "Оранжевый", 180,
                1.6f, "автоматическая", "седан", "о555оо105", 5, false, "benzine");
        Car.Key hyundaiKey = hyundai.new Key(null, "yes");
        Car.Insurance hyundaiInsurance = hyundai.new Insurance(2f, 10730.1f, "77B78FA22019");

        System.out.println(lada);
        Car.separator();
        audi.changeTire();
        System.out.println(audi);
        Car.separator();
        System.out.println(bmw);
        Car.separator();
        System.out.println(kia);
        Car.separator();
        System.out.println(hyundai);
        Car.separator();
        System.out.println("Наличие автозапуска у hyundai: " + hyundaiKey.getDistanceStartEngine() + ".");

        Car.separator();
        bmw.testRegistrationNumber(bmw.getRegistrationNumber());
        bmw.validateRegistrationNumber();
        hyundai.validateRegistrationNumber();
        hyundai.testRegistrationNumber(hyundai.getRegistrationNumber());
        ladaInsurance.isValidInsurance();
        hyundaiInsurance.isValidNumberInsurance();
        bmwInsurance.isValidNumberInsurance();
        Car.separator();

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", 301,
                "diesel","Белорусский вокзал", "Минск-Пассажирский",11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270,
                "diesel","Ленинградский вокзал", "Ленинград-Пассажирский",8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        Car.separator();

        Bus paz = new Bus("ПАЗ","3237",1960, "Россия", "Белый", 100, "diesel");
        Bus liaz = new Bus("ЛИАЗ","ЛиАЗ-5256-01",2014, "Россия", "Зеленый", 140, "diesel");
        Bus volvo = new Bus("Volvo","9500",2019, "Германия", "Красный", 160, "benzine");
        System.out.println(paz);
        System.out.println(liaz);
        System.out.println(volvo);
        Car.separator();

        lada.refill();
        audi.refill();
        lastochka.refill();
        leningrad.refill();
        paz.refill();
        volvo.refill();
    }

}

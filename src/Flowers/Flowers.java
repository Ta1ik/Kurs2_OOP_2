package Flowers;

public class Flowers {
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;


    public Flowers(String flowerColor, String country, float cost, int lifeSpan) {
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost == 0 && cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost != 0 && cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public static void sumBouquet(Flowers[] bouquet, int countFlower1, int countFlower2, int countFlower3, int countFlower4) {
        float sum = 0;
        int dayLifeSpan = Integer.MAX_VALUE;
        sum = ((bouquet[0].getCost() * countFlower1 + bouquet[1].getCost() * countFlower2 + bouquet[2].getCost() * countFlower3
                + bouquet[3].getCost() * countFlower4) * 1.1f);
        for (int i = 0; i < bouquet.length; i++) {
            if (dayLifeSpan > bouquet[i].lifeSpan && countFlower1 != 0) {
                dayLifeSpan = bouquet[i].lifeSpan;
            }
        }
        System.out.printf("Сумма букета составляет: %.2f рублей. Букет простоит: %d суток. \n", sum, dayLifeSpan);
    }

    @Override
    public String toString() {
        return "Название цветка: " + flowerColor + ", страна происхождения " + country + ", стоимость: " + cost + ", срок хранения " + lifeSpan + ".";
    }
}

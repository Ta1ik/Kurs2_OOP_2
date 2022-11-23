package Flowers;

import java.util.ArrayList;

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
        if(country != null && !country.isEmpty()){
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            this.cost = 1;
        }
        else {
            this.cost = cost;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

//    public static void sumBouquet(Flowers[] bouquet){
//        float sum = 0;
//        int dayLifeSpan = Integer.MAX_VALUE;
//        for (int i = 0; i < bouquet.length; i++) {
//          sum += bouquet[i].getCost();
//        }
//        sum = sum * 1.1f;
//        for (Flowers flowers : bouquet) {
//            if (dayLifeSpan > flowers.lifeSpan) {
//                dayLifeSpan = flowers.lifeSpan;
//            }
//        }
//        System.out.printf("Сумма букета составляет: %.2f рублей. Букет простоит: %d суток. \n", sum, dayLifeSpan);
//    }

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
        if(country != null && !country.isEmpty()){
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
        }
        else {
            this.cost = 1;
        }
    }


    @Override
    public String toString() {
        return "Название цветка: " + flowerColor + ", страна происхождения " + country + ", стоимость: " + cost + ", срок хранения " + lifeSpan + ".";
    }
}

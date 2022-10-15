package com.javarush.island.bogdanov.entity.animals;

import com.javarush.island.bogdanov.entity.anatetion.Setting;

@Setting(name = "Заяц", icon = "\uD83D\uDC07",maxWeight = 2,maxCount = 150,maxSpeed = 2,maxFood = 1)
public class Rabbit extends Herbivore {

    public Rabbit(String name, String icon, double maxWeight, int maxCount, int maxSpeed, int maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    @Override
    public void eat() {
        super.eat();
    }
}

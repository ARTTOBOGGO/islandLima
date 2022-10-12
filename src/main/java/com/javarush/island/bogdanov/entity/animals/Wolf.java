package com.javarush.island.bogdanov.entity.animals;

import com.javarush.island.bogdanov.entity.Animal;
import com.javarush.island.bogdanov.entity.anatetion.Setting;

@Setting(name = "Волк",icon = "\uD83D\uDC3A",maxWeight = 50.0,maxCount = 30,maxSpeed = 3,maxFood = 8)
public class Wolf extends Animal {

    public Wolf(String name, String icon, double maxWeight, int maxCount, int maxSpeed, int maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }
}

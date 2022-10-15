package com.javarush.island.bogdanov.entity;

import com.javarush.island.bogdanov.entity.animals.Organism;

public class Plant extends Organism {
    public Plant(String name, String icon, double maxWeight, int maxCount, int maxSpeed, int maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }
}

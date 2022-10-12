package com.javarush.island.bogdanov.entity;

import com.javarush.island.bogdanov.entity.interfaces.Eateble;

public class Animal extends Organism implements Eateble {
    String name;
    String icon;
    double maxWeight;
    int maxCount;
    int maxSpeed;
    int maxFood;

    public Animal(String name, String icon, double maxWeight, int maxCount, int maxSpeed, int maxFood) {
        this.name = name;
        this.icon = icon;
        this.maxWeight = maxWeight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.maxFood = maxFood;
    }

    @Override
    public void eat() {

    }
}

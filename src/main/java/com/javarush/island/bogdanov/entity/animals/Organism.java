package com.javarush.island.bogdanov.entity.animals;

import com.javarush.island.bogdanov.entity.DataOfOrganisms;
import com.javarush.island.bogdanov.entity.anatetion.Setting;
import com.javarush.island.bogdanov.entity.interfaces.Multiplyble;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Time;
import java.util.Objects;

public abstract class  Organism implements Multiplyble,Cloneable {

    public String name;
    String icon;
    double maxWeight;
    int maxCount;
    int maxSpeed;
    int maxFood;

    public int getMaxCount() {
        return maxCount;
    }

    public Organism(String name, String icon, double maxWeight, int maxCount, int maxSpeed, int maxFood) {
        this.name = name;
        this.icon = icon;
        this.maxWeight = maxWeight;
        this.maxCount = maxCount;
        this.maxSpeed = maxSpeed;
        this.maxFood = maxFood;
    }
    public void eat(){

    }

    public String getIcon() {
        return icon;
    }

    @Override
    public void multiply() {

    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Organism newObject(Class<?> classAnimal) {
        Setting setting = classAnimal.getAnnotation(Setting.class);
        try {
            Constructor<?> constructor = classAnimal.getConstructor(String.class,String.class,double.class,int.class,int.class,int.class);
            String name = setting.name();
            String icon = setting.icon();
            double weight = setting.maxWeight();
            int count = setting.maxCount();
            int speed = setting.maxSpeed();
            int food = setting.maxFood();
            return (Organism) constructor.newInstance(name, icon, weight, count, speed, food);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Organism)) return false;
//        Organism organism = (Organism) o;
//        return Double.compare(organism.maxWeight, maxWeight) == 0 && maxCount == organism.maxCount && maxSpeed == organism.maxSpeed && maxFood == organism.maxFood && Objects.equals(name, organism.name) && Objects.equals(icon, organism.icon);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
//    }
}

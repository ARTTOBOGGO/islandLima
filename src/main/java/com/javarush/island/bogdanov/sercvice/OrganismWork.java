package com.javarush.island.bogdanov.sercvice;

import com.javarush.island.bogdanov.entity.DataOfOrganisms;
import com.javarush.island.bogdanov.entity.anatetion.Setting;
import com.javarush.island.bogdanov.entity.animals.Organism;
import com.javarush.island.bogdanov.entity.animals.Rabbit;
import com.javarush.island.bogdanov.entity.animals.Wolf;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class OrganismWork extends Thread{



    public Set<Class<?>> TYPES = Set.of(Rabbit.class, Wolf.class);
    Set<Organism> RESIDENTS = new HashSet<>();
    Organism organism;




    public void run() {
        for (Class<?> type : TYPES) {
            RESIDENTS.add(newObject(type));
        }
    }


    public static Organism newObject(Class<?> classAnimal) {
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
    public Set<Class<?>> getTYPES() {
        return TYPES;
    }
}

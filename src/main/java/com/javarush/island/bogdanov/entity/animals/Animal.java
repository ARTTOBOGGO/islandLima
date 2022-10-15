package com.javarush.island.bogdanov.entity.animals;

import com.javarush.island.bogdanov.entity.anatetion.Setting;
import com.javarush.island.bogdanov.entity.interfaces.Eateble;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public abstract class Animal extends Organism implements Eateble {


    public Animal(String name, String icon, double maxWeight, int maxCount, int maxSpeed, int maxFood) {
        super(name, icon, maxWeight, maxCount, maxSpeed, maxFood);
    }

    public void eat(){
        //System.out.print();
    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}

package com.javarush.island.bogdanov.entity;

import com.javarush.island.bogdanov.entity.animals.Organism;
import com.javarush.island.bogdanov.sercvice.OrganismWork;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cell {

        public volatile Map<Type, Set<Organism>> inhabitanse = new HashMap<>();

        public void setInhabitanse(Type type, Set<Organism> organisms) {
                inhabitanse.put(type,organisms);
        }

        public Map<Type, Set<Organism>> getInhabitanse() {
                return inhabitanse;
        }
}

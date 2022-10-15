package com.javarush.island.bogdanov.entity;

import com.javarush.island.bogdanov.entity.animals.Organism;
import com.javarush.island.bogdanov.entity.animals.Rabbit;
import com.javarush.island.bogdanov.entity.animals.Wolf;

import java.util.HashSet;
import java.util.Set;

public class DataOfOrganisms {
    public Set<Class<?>> TYPES = Set.of(Rabbit.class, Wolf.class);
    public Set<Organism> RESIDENTS = new HashSet<>();
}

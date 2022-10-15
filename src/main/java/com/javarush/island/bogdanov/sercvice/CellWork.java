package com.javarush.island.bogdanov.sercvice;

import com.javarush.island.bogdanov.entity.Cell;
import com.javarush.island.bogdanov.entity.animals.Organism;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class CellWork extends Thread {
    Cell cell;

    public CellWork(Cell cell) {
        this.cell = cell;
    }

    OrganismWork organismWork= new OrganismWork();

    Set<Organism>  residents = organismWork.RESIDENTS;
    Set<Organism> clons = new HashSet<>();

    @Override
    public void run() {
        organismWork.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        clonableOrgan();


    }
 public void putInCellOfAnimal(Type type, Set<Organism> organisms){
     cell.setInhabitanse(type,organisms);
 }
   public void clonableOrgan(){
       for (Organism resident : residents) {

           try {
               int maxCount = maxCounts(resident);
               Type type = null;
               Set<Organism> organisms=new HashSet<>();

               for (int i = 0; i < maxCount; i++) {
                   Organism clone = (Organism)resident.clone();
                   type= clone.getClass();
                   organisms.add(clone);
                   
               }
               putInCellOfAnimal(type,organisms);
               
           } catch (CloneNotSupportedException e) {
               throw new RuntimeException(e);
           }
       }
   }
   public static int maxCounts(Organism organism){
        int maxCount = organism.getMaxCount();
       return ThreadLocalRandom.current().nextInt(0,maxCount);
   }


}

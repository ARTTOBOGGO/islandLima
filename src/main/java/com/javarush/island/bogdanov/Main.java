package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.entity.Cell;
import com.javarush.island.bogdanov.entity.GameField;
import com.javarush.island.bogdanov.entity.GameFieldWork;
import com.javarush.island.bogdanov.entity.anatetion.Setting;
import com.javarush.island.bogdanov.entity.animals.Animal;
import com.javarush.island.bogdanov.entity.animals.Organism;
import com.javarush.island.bogdanov.entity.animals.Rabbit;
import com.javarush.island.bogdanov.entity.animals.Wolf;
import com.javarush.island.bogdanov.sercvice.CellWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(6);

        GameField gameField = new GameField(100,20);
        GameFieldWork gameFieldWork =  new GameFieldWork(gameField);
            executorService.execute(gameFieldWork);
        Thread.sleep(5000);
        executorService.shutdown();
        Cell[][] cells = gameField.cells;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.println(i+"("+j+")"+cells[i][j].getInhabitanse());
            }
        }
    }

}
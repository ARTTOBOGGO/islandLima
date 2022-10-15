package com.javarush.island.bogdanov.entity;

import com.javarush.island.bogdanov.sercvice.CellWork;

public class GameFieldWork extends Thread{
    GameField gamefield;

    public GameFieldWork(GameField gamefield) {
        this.gamefield = gamefield;
    }

    @Override
    public void run() {

        for (int i = 0; i < gamefield.column; i++) {
            for (int j = 0; j < gamefield.row; j++) {
                Cell cell = new Cell();
                CellWork cellWork = new CellWork(cell);
                cellWork.start();
                gamefield.setCells(cell, i, j);
            }
        }


    }
}

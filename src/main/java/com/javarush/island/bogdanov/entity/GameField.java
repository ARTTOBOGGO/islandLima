package com.javarush.island.bogdanov.entity;

public class GameField {
    int column;
    int row;
    Cell cell;
     public Cell[][] cells;

    public GameField(int column, int row) {
        this.column = column;
        this.row = row;
        cells = new Cell[column][row];
    }

    public Cell getCell() {
        return cell;
    }

    public void setCells(Cell cell, int columnNow, int rowNow) {
        cells[columnNow][rowNow] = cell;
        this.cell=cell;
    }



}

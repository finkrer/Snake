package com.snake.data.cell;

public class Wall extends Cell {
    public Wall(int x, int y) {
        super(x, y);
        isWalkable = false;
    }
}
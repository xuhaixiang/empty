package com.ft.kata.bowloing;

public class Game {
    int score = 0;
    public void roll(int pins) {
        score += pins;
    }

    public int score(){
        return score;
    }
}

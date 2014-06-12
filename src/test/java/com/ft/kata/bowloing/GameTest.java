package com.ft.kata.bowloing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void rollZeroScoreZero(){
        Game g = new Game();
        g.roll(0);
        assertEquals(0, g.score());
    }
}

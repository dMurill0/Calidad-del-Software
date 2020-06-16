package com.example.test;

import com.example.tetris.Tablero;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableroTest {
    @Test
    public void tableroModoCuarentenaTest(){
        Tablero tablero = new Tablero();
        tablero.añadeAlturaTablero(2);
        tablero.añadeAnchuraTablero(2);
        assertEquals(tablero.getAlturaTablero(), 22);
        assertEquals(tablero.getAnchoTablero(), 12);
    }
}

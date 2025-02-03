package ru.lkodos;

import java.io.IOException;

public class Start {

    public static void main(String[] args) {

        try {
            Game.startGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
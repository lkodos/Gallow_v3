package ru.lkodos;

import java.io.IOException;
import java.util.Scanner;

public class Game {

    public static void startGame() throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Новая игра");
            System.out.println("2 - Выход");
            int choice = System.in.read();
            if (choice == 49) {
                newGame();
            } else if (choice == 50) {
                System.out.println("Конец игры");
                System.exit(0);
            } else {
                System.out.println("Некорректный ввод");
                System.in.skip(System.in.available());
            }
        }
    }

    private static void newGame() {
        System.out.println("start new game");
    }
}
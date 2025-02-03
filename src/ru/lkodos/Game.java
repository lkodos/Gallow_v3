package ru.lkodos;

import java.io.IOException;
import java.util.Scanner;

public class Game {

    public static void startGame() throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Новая игра");
            System.out.println("2 - Выход");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                newGame();
            } else if (choice.equals("2")) {
                System.out.println("Конец игры");
                System.exit(0);
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }

    private static void newGame() {
        System.out.println("start new game");
        System.out.println();
    }
}
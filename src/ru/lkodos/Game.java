package ru.lkodos;

import java.util.List;
import java.util.Scanner;

public class Game {

    public static void startGame() {

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

        List<String> secretWord = WordService.getListFromString();
        System.out.println(secretWord);







    }
}
package ru.lkodos;

import java.util.ArrayList;
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

        List<String> currentSecretWord = new ArrayList<>();
        int levelOfGallow = 0;
        boolean isWin = false;

        List<String> secretWord = WordService.getListFromString();
        currentSecretWord = secretWordToStars(secretWord);
        showCurrentWord(secretWord);
        showCurrentWord(currentSecretWord);
        System.out.println();

        while (levelOfGallow < Gallow.gallows.size()) {
            if (secretWord.equals(currentSecretWord)) {
                isWin = true;
                break;
            }
        }

        if (isWin) {
            System.out.println("ПБЕДА!!!");
        } else {
            System.out.println("ВАМ КОНЕЦ");
        }







    }

    private static List<String> secretWordToStars(List<String> secretWord) {
        List<String> currentWordList = new ArrayList<>();
        for (String letter : secretWord) {
            currentWordList.add("*");
        }
        return currentWordList;
    }

    private static void showCurrentWord(List<String> currentWord) {
        for (String letter : currentWord) {
            System.out.print(letter.toUpperCase() + " ");
        }
        System.out.println();
    }
}
package ru.lkodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);

    public static void startGame() {

        while (true) {
            System.out.println("1 - Новая игра");
            System.out.println("2 - Выход");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                newGame();
            } else if (choice.equals("2")) {
                System.out.println("Конец игры");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }

    private static void newGame() {

        List<String> currentSecretWord = new ArrayList<>();
        List<String> usedLetters = new ArrayList<>();
        int levelOfGallow = 0;
        boolean isWin = false;
        String letter;

        List<String> secretWord = WordService.getListFromString();
        currentSecretWord = secretWordToStars(secretWord);

        while (levelOfGallow < Gallow.gallows.size() - 1) {
            if (secretWord.equals(currentSecretWord)) {
                isWin = true;
                break;
            }

            System.out.println("(" + secretWord + ")");
            System.out.print("Загадано слово: ");
            showCurrentWord(currentSecretWord);
            System.out.println();
            System.out.println(Gallow.getGallow(levelOfGallow));
            System.out.println("Использованные буквы " + usedLetters);
            System.out.println("Введите букву: ");
            System.out.println();

            while (true) {
                letter = scanner.nextLine();
                if ( letter.isEmpty()) {
                    System.out.println("Введите букву");
                } else if (alreadyBeen(usedLetters, letter)) {
                    System.out.println("Такая буква уже была, повторите ввод");
                } else {
                    usedLetters.add(letter);
                    break;
                }
            }

            if (openLetterInSecretWord(letter, secretWord, currentSecretWord)) {
                System.out.println("Есть такая буква в этом слове");
                System.out.println(currentSecretWord);
                System.out.println();
            }
            else {
                System.out.println("Такой буквы нет");
                levelOfGallow++;
            }
        }

        if (isWin) {
            System.out.println("ПБЕДА!!!");
            System.out.println();
        } else {
            System.out.println("ВАМ КОНЕЦ");
            System.out.println(Gallow.getGallow(levelOfGallow));
        }
    }

    private static boolean openLetterInSecretWord(String letter, List<String> secretWord, List<String> currentSecretWord) {
        boolean isPresent = false;
        for (int i = 0; i < secretWord.size(); i++) {
            if (letter.equals(secretWord.get(i))) {
                currentSecretWord.set(i, letter);
                isPresent = true;
            }
        }
        return isPresent;
    }

    private static boolean alreadyBeen(List<String> usedLetters, String letter) {
        return usedLetters.contains(letter);
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
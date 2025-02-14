package ru.lkodos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordService {

    private static List<String> listOfWords = new ArrayList<>();

    private static List<String> getListOfWordsFromFile() {

        try {
            listOfWords = Files.readAllLines(Paths.get("resources/words.txt"));
        } catch (IOException e) {
            System.out.println("File not found");
            System.exit(1);
        }
        return listOfWords;
    }

    public static String getRandomWordFromList() {
        listOfWords = getListOfWordsFromFile();
        Random random = new Random();
        int randomIndex = random.nextInt(listOfWords.size());
        return listOfWords.get(randomIndex);
    }

    public static List<String> getListFromString() {
        String str = getRandomWordFromList();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) + "");
        }
        return list;
    }
}
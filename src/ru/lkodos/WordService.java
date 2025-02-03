package ru.lkodos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordService {

    private static List<String> listOfWords;

    private static List<String> getListOfWordsFromFile() {
        try {
            listOfWords = Files.readAllLines(Paths.get("singular_words.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listOfWords;
    }

    public static String getRandomWordFromList() {
        listOfWords = getListOfWordsFromFile();
        Random random = new Random();
        int randomIndex = random.nextInt(listOfWords.size());
        return listOfWords.get(randomIndex);
    }

    public static List<String> getListFromString(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i) + "");
        }
        return list;
    }
}
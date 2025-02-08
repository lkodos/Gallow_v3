package ru.lkodos;

import java.util.ArrayList;
import java.util.List;

public class Gallow {

    static List<String> gallows = new ArrayList<>();

    static {
        setGallows();
    }

    public static String getGallow(int index) {
        return gallows.get(index);
    }

    private static void setGallows() {
        // levelOfGallow 0
        gallows.add("""
                  ########
                   #    |
                   #
                   #
                   #
                   #
                 #####
                """);
        // levelOfGallow 1
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #
                   #
                   #
                 #####
                """);
        // levelOfGallow 2
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #    #
                   #
                   #
                 #####
                """);
        // levelOfGallow 3
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#
                   #
                   #
                 #####
                """);
        // levelOfGallow 4
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#\\
                   #
                   #
                 #####
                """);
        // levelOfGallow 5
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#\\
                   #   /
                   #
                 #####
                """);
        // levelOfGallow 6
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#\\
                   #   / \\
                   #
                 #####
                """);
    }
}

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
        gallows.add("""
                  ########
                   #    |
                   #
                   #
                   #
                   #
                 #####
                """);
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #
                   #
                   #
                 #####
                """);
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #    #
                   #
                   #
                 #####
                """);
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#
                   #
                   #
                 #####
                """);
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#\\
                   #
                   #
                 #####
                """);
        gallows.add("""
                  ########
                   #    |
                   #    0
                   #   /#\\
                   #   /
                   #
                 #####
                """);
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
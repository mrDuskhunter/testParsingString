package org.example.testParsingString;

import java.util.Scanner;

public class Parser {
    public static String parser(String string) {
        Scanner scanner = new Scanner(string);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        int count;
        String value = "dick";
        int max = 1;

        for (Character c : chars) {
            count=0;
            for (Character c2 : chars) {
                if (c.equals(c2)) {
                    count++;
                }
                if (count >= max) {
                    max = count;
                    value = c.toString();
                }
            }
        }
        return value + " " + max;
    }
}

package org.example.testParsingString;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LettersCountServiceImpl {
    public LetterCountResponse pars(String string) {
        Scanner scanner = new Scanner(string);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        int count;
        String value = "";
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
        return new LetterCountResponse(value,max);
    }
}

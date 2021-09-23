package org.example.testParsingString;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class LettersCountService {
    public LetterCountResponse pars(String userText) {
        String input = new Scanner(userText).nextLine();

        char[] chars = input.toCharArray();

        String value = "";
        int max = 1;
        int count = 1;
        int lastIndex = 0;

        Arrays.sort(chars);

        for (int i = 1; i < chars.length; i++) {
            Character a = chars[i],
                    b = chars[i - 1];
            if (a.equals(b)) count++;
            if (count > max || (count == max && (input.indexOf(b)) > lastIndex)) {
                max = count;
                value = b.toString();
                lastIndex = input.indexOf(b);
            }
            if (!a.equals(b)) count = 1;
        }
        return new LetterCountResponse(value, max);
    }
}
package org.example.testParsingString;

public class LetterCountResponse {
    private final String letter;
    private final long count;

    public LetterCountResponse(String letter, long count) {
        this.letter = letter;
        this.count = count;
    }

    public String getLetter() {
        return letter;
    }

    public long getCount() {
        return count;
    }
}

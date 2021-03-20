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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LetterCountResponse that = (LetterCountResponse) o;

        if (count != that.count) return false;
        return letter != null ? letter.equals(that.letter) : that.letter == null;
    }

    @Override
    public int hashCode() {
        int result = letter != null ? letter.hashCode() : 0;
        result = 31 * result + (int) (count ^ (count >>> 32));
        return result;
    }
}

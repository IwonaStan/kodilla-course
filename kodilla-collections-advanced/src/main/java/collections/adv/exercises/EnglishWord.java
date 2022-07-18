package collections.adv.exercises;

import java.util.Objects;

public class EnglishWord {

    private PartOfSpeech parOfSpeech;
    private String word;

    public EnglishWord(PartOfSpeech parOfSpeech, String word) {
        this.parOfSpeech = parOfSpeech;
        this.word = word;
    }

    public PartOfSpeech getParOfSpeech() {
        return parOfSpeech;
    }
    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return parOfSpeech == that.parOfSpeech && Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parOfSpeech, word);
    }
}

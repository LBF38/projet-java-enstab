package bibliotheque;

public class Dictionary extends Document {
    public enum Language {
        ENGLISH,
        FRENCH,
        SPANISH
    }

    private final Language language;

    public Dictionary(int regNum, String title, Language language) {
        super(regNum, title);
        this.language = language;
    }

    public Language getLanguage() {
        return this.language;
    }

    @Override
    public String toString() {
        return "{" +
                " language='" + getLanguage() + "'" +
                "}";
    }

}

package bibliotheque;

public class Manual extends Book {
    public enum Level {
        ECOLE_ELEMENTAIRE,
        COLLEGE,
        LYCEE,
        PREPA,
        ECOLE_INGENIEUR,
        ECOLE_COMMERCE
    }

    private final Level level;

    public Level getLevel() {
        return this.level;
    }

    public Manual(int regNum, String title, String author, int nbrPages, Level level) {
        super(regNum, title, author, nbrPages);
        this.level = level;
    }

    @Override
    public String toString() {
        return "{" +
                " regNum='" + getRegNum() + "'" +
                " title='" + getTitle() + "'" +
                " author='" + getAuthor() + "'" +
                " nbrPages='" + getNbrPages() + "'" +
                " level='" + getLevel() + "'" +
                "}";
    }
}

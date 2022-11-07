package bibliotheque;

public class Book extends Document {
    private final String author;
    private final int nbrPages;

    public String getAuthor() {
        return this.author;
    }

    public int getNbrPages() {
        return this.nbrPages;
    }

    public Book(int regNum, String title, String author, int nbrPages) {
        super(regNum, title);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString() {
        return "{" +
                " author='" + getAuthor() + "'" +
                ", nbrPages='" + getNbrPages() + "'" +
                "}";
    }

}
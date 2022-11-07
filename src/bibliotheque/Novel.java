package bibliotheque;

public class Novel extends Book {
    public enum LiteraryPrice {
        GONCOURT,
        MEDICIS,
        INTERALLIE
    }

    private final LiteraryPrice literaryPrice;

    public Novel(int regNum, String title, String author, int nbrPages, LiteraryPrice literaryPrice) {
        super(regNum, title, author, nbrPages);
        this.literaryPrice = literaryPrice;
    }

    public LiteraryPrice getLiteraryPrice() {
        return this.literaryPrice;
    }

    @Override
    public String toString() {
        return "{" +
            " literaryPrice='" + getLiteraryPrice() + "'" +
            "}";
    }

}

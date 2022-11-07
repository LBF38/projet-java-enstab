package bibliotheque;

public abstract class Document {
    private final int regNum;
    private final String title;

    public Document(int regNum, String title) {
        this.regNum = regNum;
        this.title = title;
    }

    public int getRegNum() {
        return this.regNum;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "{" +
                " regNum='" + getRegNum() + "'" +
                ", title='" + getTitle() + "'" +
                "}";
    }

}

package bibliotheque;

public class Magazine extends Document {
    private final int month;
    private final int year;

    public Magazine(int regNum, String title, int month, int year) {
        super(regNum, title);
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "{" +
            " month='" + getMonth() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }

}

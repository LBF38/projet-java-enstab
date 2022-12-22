package arithmetiques;

public class Constant implements Expression {
    public Number value;

    public Constant(Number value) {
        this.value = value;
    }

    @Override
    public double value(double x) {
        return value.doubleValue();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

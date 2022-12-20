package arithmetiques;

public class Variable implements Expression {
    @Override
    public double value(double x) {
        return x;
    }

    @Override
    public String toString() {
        return "x";
    }
}

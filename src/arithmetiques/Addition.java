package arithmetiques;

public class Addition extends OperationBinary {
    Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double value(double x) {
        return leftOperation.value(x) + rightOperation.value(x);
    }

    @Override
    public String toString() {
        return "(" + leftOperation.toString() + " + " + rightOperation.toString() + ")";
    }
}

package arithmetiques;

public class Exp extends OperationUnary {
    Exp(Expression operation) {
        super(operation);
    }

    @Override
    public double value(double x) {
        return Math.exp(operation.value(x));
    }

    @Override
    public String toString() {
        return "exp(" + operation.toString() + ")";
    }
}

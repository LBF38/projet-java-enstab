package arithmetiques;

public class Cos extends OperationUnary {
    Cos(Expression operation) {
        super(operation);
    }

    @Override
    public double value(double x) {
        return Math.cos(operation.value(x));
    }

    @Override
    public String toString() {
        return "cos(" + operation.toString() + ")";
    }
}

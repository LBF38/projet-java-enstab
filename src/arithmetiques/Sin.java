package arithmetiques;

public class Sin extends OperationUnary {
    Sin(Expression operation) {
        super(operation);
    }

    @Override
    public double value(double x) {
        return Math.sin(operation.value(x));
    }

    @Override
    public String toString() {
        return "sin(" + operation.toString() + ")";
    }
}

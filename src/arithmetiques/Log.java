package arithmetiques;

public class Log extends OperationUnary {
    Log(Expression operation) {
        super(operation);
    }

    @Override
    public double value(double x) {
        return Math.log(operation.value(x));
    }

    @Override
    public String toString() {
        return "log(" + operation.toString() + ")";
    }
}

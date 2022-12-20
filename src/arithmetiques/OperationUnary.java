package arithmetiques;

public abstract class OperationUnary {
    Expression operation;

    public OperationUnary(Expression operation) {
        this.operation = operation;
    }
}

package arithmetiques;

public abstract class OperationUnary implements Expression {
    Expression operation;

    OperationUnary(Expression operation) {
        this.operation = operation;
    }
}

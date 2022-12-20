package arithmetiques;

public abstract class OperationBinary implements Expression {
    Expression leftOperation;
    Expression rightOperation;

    public OperationBinary(Expression leftOperation, Expression rightOperation) {
        this.leftOperation = leftOperation;
        this.rightOperation = rightOperation;
    }
}

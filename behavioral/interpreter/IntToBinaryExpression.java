package behavioral.interpreter;

public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext iContext) {
        return iContext.getBinaryFormat(i);
    }
    
}

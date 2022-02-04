package behavioral.interpret;

public class IntToHexExpression implements Expression {


    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext iContext) {
        return iContext.getHexadecimalFormat(i);
    }
}

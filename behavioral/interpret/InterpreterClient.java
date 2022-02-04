package behavioral.interpret;

public class InterpreterClient {

    public InterpreterContext iContext;
    public InterpreterClient(InterpreterContext i) {
        this.iContext = i;
    }

    public String interpret(String str) {
        Expression exp = null;
        // create rules for expressions
        if (str.toLowerCase().contains("hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else if (str.toLowerCase().contains("binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else return str;

        return exp.interpret(iContext);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterClient iClient = new InterpreterClient(new InterpreterContext());

        System.out.println(iClient.interpret(str1));
        System.out.println(iClient.interpret(str2));
        System.out.println(iClient.interpret("9531 to Hexadecimal"));
    }
}

package testing.junit4;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String operand: expression.split("\\+"))
            sum += Integer.parseInt(operand);
        return sum;
    }
}

package likelion.problem2b;

import static likelion.problem2b.Input.getInput;

public class Expression {

    public static String[] getExpression() {
        String input = getInput();
        String[] inputString = input.split(" ");

        return inputString;
    }
}

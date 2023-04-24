package likelion.problem2b;

import static likelion.problem2b.Cast.*;
import static likelion.problem2b.Expression.getExpression;
import static likelion.problem2b.Math.*;

public class Solution2 {
    public static void main(String[] args) {

        String[] inputString = getExpression();
        int[] inputInt;

        inputInt = StringtoInt(inputString);

        int max = getMax(inputInt);
        int min = getMin(inputInt);

        System.out.print("max:" + max + ", min:" + min);
    }
}

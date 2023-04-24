package likelion.problem2b;

public class Math {

    public static int getMax(int[] inputInt) {

        int max = inputInt[0];

        for (int i = 1; i < inputInt.length; i++) {

            if (max < inputInt[i]) {
                max = inputInt[i];
            }
        }

        return max;
    }

    public static int getMin(int[] inputInt) {

        int min = inputInt[0];

        for (int i = 1; i < inputInt.length; i++) {

            if (min > inputInt[i]) {
                min = inputInt[i];
            }
        }

        return min;
    }
}

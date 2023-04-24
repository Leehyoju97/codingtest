package likelion.problem2b;

public class Cast {

    public static int[] StringtoInt(String[] inputString) {

        int[] inputInt= new int[inputString.length];

        for (int i = 0; i < inputString.length; i++) {
            inputInt[i] = Integer.parseInt(inputString[i]);
        }

        return inputInt;
    }
}

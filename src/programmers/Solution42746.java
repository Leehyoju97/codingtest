package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution42746 {

    public String solution(int[] numbers) {

        int size = numbers.length;
        String[] sNumbers = new String[size];

        for (int i = 0; i < size; i++) {
            sNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(sNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 예를 들어 0, 0 이런식으로 나오면 00이렇게 나오는 것을 방지하기 위해
        if (sNumbers[0].equals("0")) return "0";

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < size; i++) {
            answer.append(sNumbers[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        Solution42746 solution42746 = new Solution42746();
        String result = solution42746.solution(numbers);
        System.out.println(result);
    }
}

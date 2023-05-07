package programmers;

import java.util.Arrays;
public class Solution42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;

        for (int x = 1; x < brown; x++) {
            int y = area / x;

            if ((x - 2) * (y - 2) == yellow) {
                answer[0] = x;
                answer[1] = y;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution42842 s = new Solution42842();

        int[] result = s.solution(10, 2);

        System.out.println(Arrays.toString(result));
    }
}

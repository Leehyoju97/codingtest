package programmers;

import java.util.Arrays;

public class Solution42747 {

    public int solution(int[] citations) {
        int answer = 0;
        int size = citations.length;
        int count = 0;

        Arrays.sort(citations);

        for (int i = 0; i < size; i++) {
            count = size - i;

            if (count <= citations[i]) {
                answer = count;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};

        Solution42747 s = new Solution42747();
        int result = s.solution(citations);
        System.out.println(result);
    }
}

package programmers;

public class Solution84512 {

    public int solution(String word) {
        int answer = word.length();
        String aeiou = "AEIOU";

        // f(n) = 5 * f(n - 1) + 1  f(0) = 0
        int[] increase = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            int index = aeiou.indexOf(word.charAt(i));
            answer += increase[i] * index;
        }
        return answer;
    }

    public static void main(String[] args) {

        String word = "AAAAE";

        Solution84512 s = new Solution84512();
        int result = s.solution(word);

        System.out.println(result);

    }
}


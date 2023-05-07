package programmers;

public class Solution86491 {

    public int solution(int[][] sizes) {
        int w_max = 0;
        int h_max = 0;
        int result = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            w_max = Math.max(w_max, w);
            h_max = Math.max(h_max, h);
        }

        result = w_max * h_max;

        return result;
    }

    public static void main(String[] args) {
        Solution86491 s = new Solution86491();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int result = s.solution(sizes);

        System.out.println(result);
    }
}

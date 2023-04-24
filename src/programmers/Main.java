package programmers;

public class Main {

    public static void main(String[] args) {
       /*
        int [][] lottories = {{10, 19, 800}, {20, 39, 200}, {100, 199, 500}};
        Solution solution = new Solution();
        int result = solution.solution(lottories);
        System.out.println("result = " + result);
        */

        int[][] s = {{2,0}, {3,1}};
        Solution solution = new Solution();
        int[] v = solution.solution(s);

        for (int i = 0 ; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}

/*

class Solution {
    public int solution(int[][] lotteries) {
        int answer = 0;
        double max = 0.0;
        double percent;

        for (int i = 0; i < lotteries.length; i++) {

            percent = (double)lotteries[i][0] / (double)(lotteries[i][1] + 1);

            if(percent > max) {
                max = percent;
                answer = i;
            } else if (percent == max) {
                if (lotteries[answer][2] < lotteries[i][2]) {
                    answer = i;
                }
            }

        }

        return answer + 1;
    }
}*/


class Solution {
    public int[] solution(int[][] queries) {
        int[] answer = {};
        return answer;
    }
}

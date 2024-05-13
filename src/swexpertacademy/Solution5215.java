package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution5215 {
    static int[] scores;
    static int[] calories;
    static int ingredient, limitCalorie, maxScore;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            ingredient = Integer.parseInt(st.nextToken());
            limitCalorie = Integer.parseInt(st.nextToken());
            scores = new int[ingredient];
            calories = new int[ingredient];

            for (int i = 0; i < ingredient; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                scores[i] = Integer.parseInt(st.nextToken());
                calories[i] = Integer.parseInt(st.nextToken());
            }

            maxScore = 0;
            getMaxScoreLimitCalorie(0, 0, 0);

            sb.append("#" + tc + " " + maxScore + "\n");
        }

        System.out.println(sb);
    }

    private static void getMaxScoreLimitCalorie(int cnt, int scoreSum, int calorieSum) {
        // 종료조건1
        if (calorieSum > limitCalorie) return;
        // 종료조건2
        if (cnt == ingredient) {
            if (calorieSum <= limitCalorie) maxScore = Math.max(maxScore, scoreSum);
            return;
        }

        // 재료 선택
        getMaxScoreLimitCalorie(cnt + 1, scoreSum + scores[cnt], calorieSum + calories[cnt]);

        // 재료 선택 x
        getMaxScoreLimitCalorie(cnt + 1, scoreSum, calorieSum);
    }
}


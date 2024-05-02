package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1204  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] scores = new int[101];

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                scores[score]++;
            }
            int max = scores[0];
            int maxScore = 0;

            for (int i = 100; i > 0; i--) {
                if (max < scores[i]) {
                    max = scores[i];
                    maxScore = i;
                }
            }

            sb.append("#").append(n).append(" ").append(maxScore).append("\n");
        }
        System.out.println(sb);
    }
}

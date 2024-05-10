package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int count;

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] towers = new int[n];
            st = new StringTokenizer(br.readLine());
            count = 0;

            for (int i = 0; i < n; i++) {
                towers[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < n - 2; i++) {
                int middle = towers[i];
                int start = i - 2;
                int end = i + 2;
                int max = towers[start];

                for (int j = start; j <= end; j++) {
                    if (j == i) continue;
                    if (max < towers[j]) max = towers[j];
                }

                count += (middle > max) ? middle - max : 0;
            }

            sb.append("#").append(tc + " " + count).append("\n");
        }

        System.out.println(sb);
    }
}

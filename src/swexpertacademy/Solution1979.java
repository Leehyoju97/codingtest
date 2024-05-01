package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[n][n];
            int result = 0;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int l = 0; l < n; l++) {
                    arr[j][l] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로 체크
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int l = 0; l < n; l++) {
                    if (arr[j][l] == 0) {
                        if (count == k) {
                            result++;
                        }
                        count = 0;
                    } else if (arr[j][l] == 1) count++;
                }
                if (count == k) result++;
            }

            // 세로 체크
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int l = 0; l < n; l++) {
                    if (arr[l][j] == 0) {
                        if (count == k) {
                            result++;
                        }
                        count = 0;
                    } else if (arr[l][j] == 1) count++;
                }
                if (count == k) result++;
            }
            System.out.println("#" + i + " " + result);
        }
    }
}

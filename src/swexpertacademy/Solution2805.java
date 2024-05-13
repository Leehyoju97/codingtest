package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2805 {
    static int[][] matrix;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            matrix = new int[n][n];
            sum = 0;

            for (int row = 0; row < n; row++) {
                String revenue = br.readLine();
                for (int column = 0; column < n; column++) {
                    matrix[row][column] = revenue.charAt(column) - '0';
                }
            }

            int middle = n / 2;
            int start = middle;
            int end = middle;

            for (int row = 0; row < n; row++) {
                for (int column = start; column <= end; column++) {
                    sum += matrix[row][column];
                }

                if (row < middle) {
                    start--;
                    end++;
                } else {
                    start++;
                    end--;
                }
            }
            sb.append("#" + tc + " " + sum + "\n");
        }

        System.out.println(sb);
    }
}

package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1209 {
    static int[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            matrix = new int[100][100];
            for (int row = 0; row < 100; row++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int column = 0; column < 100; column++) {
                    matrix[row][column] = Integer.parseInt(st.nextToken());
                }
            }

            int max = Integer.MIN_VALUE;
            int sumRow;
            int sumColumn;

            for (int row = 0; row < 100; row++) {
                sumRow = 0;
                sumColumn = 0;
                for (int column = 0; column < 100; column++) {
                    sumRow += matrix[row][column];
                    sumColumn += matrix[column][row];
                }

                max = Math.max(max, sumRow);
                max = Math.max(max, sumColumn);
            }

            // 오른쪽 아래 대각선
            int sumDiagonalDown = 0;
            // 오른쪽 위 대각선
            int sumDiagonalUp = 0;
            for (int row = 0; row < 100; row++) {
                sumDiagonalDown += matrix[row][row];
                sumDiagonalUp += matrix[row][99 - row];
            }

            max = Math.max(max, sumDiagonalDown);
            max = Math.max(max, sumDiagonalUp);

            sb.append("#" + n + " " + max + "\n");
        }

        System.out.println(sb);
    }
}

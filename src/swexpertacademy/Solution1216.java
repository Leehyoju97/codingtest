package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1216 {
    public static final int L = 100;
    static char[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            matrix= new char[L][L];
            for (int i = 0; i < L; i++) {
                String str = br.readLine();
                for (int j = 0; j < L; j++) {
                    matrix[i][j] = str.charAt(j);
                }
            }

            for (int i = L; i > 0; i--) {
                if (isSolve(i)) {
                    sb.append("#" + n + " " + i + "\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }

    private static boolean isSolve(int l) {
        for (int row = 0; row < L; row++) {
            for (int column = 0; column <= (L - l); column++) {
                if (isSolveRow(row, column, l) || isSolveColumn(column, row, l)) return true;
            }
        }
        return false;
    }

    private static boolean isSolveRow(int row, int column, int l) {
        for (int i = 0; i < (l / 2); i++) {
            if (matrix[row][column + i] != matrix[row][column - i + l - 1]) return false;
        }
        return true;
    }
    private static boolean isSolveColumn(int column, int row, int l) {
        for (int i = 0; i < (l / 2); i++) {
            if (matrix[column + i][row] != matrix[column - i + l - 1][row]) return false;
        }
        return true;
    }
}

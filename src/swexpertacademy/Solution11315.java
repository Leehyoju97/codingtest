package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution11315 {
    static char[][] matrix;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            matrix = new char[n][n];

            for (int i = 0; i < n; i++) {
                String str = br.readLine();
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = str.charAt(j);
                }
            }

            boolean check = false;
            // 가로 체크
            for (int i = 0; i < n; i++) {
                count = 0;
                for (int j = 0; j < n - 1; j++) {
                    if (matrix[i][j] == 'o' && matrix[i][j + 1] == 'o') count++;
                    if (matrix[i][j] == 'o' && matrix[i][j + 1] != 'o') count = 0;
                    if (count >= 5) {
                        check = true;
                        break;
                    }
                }
                if (check) break;
            }

            // 세로 체크
            for (int i = 0; i < n; i++) {
                if (check) break;
                count = 0;
                for (int j = 0; j < n - 1; j++) {
                    if (matrix[j][i] == 'o' && matrix[j + 1][i] == 'o') count++;
                    if (matrix[j][i] == 'o' && matrix[j + 1][i] != 'o') count = 0;
                    if (count >= 5) {
                        check = true;
                        break;
                    }
                }
            }

            // 대각선 오른쪽 아래1
            for (int i = 1; i < n; i++) {
                if (check) break;
                count = 0;
                for (int j = 0; j < n; j++) {
                    int y = i;
                    int x = j;

                    if ((y - x) != 1) continue;
                    if ((y - x) == 1) {
                        if (matrix[y][x] == matrix[y + 1][x + 1]) count++;
                        if (matrix[y][x] != matrix[y + 1][x + 1]) count = 0;
                    }
                    if (count >= 5) {
                        check = true;
                        break;
                    }
                }
            }

            // 대각선 오른쪽 아래2
            for (int i = 0; i < n - 1; i++) {
                if (check) break;
                count = 0;
                for (int j = 0; j < n - 1; j++) {
                    if (i != j) break;
                    if (i == j) {
                        if (matrix[i][j] == matrix[i + 1][j + 1]) count++;
                        if (matrix[i][j] != matrix[i + 1][j + 1]) count = 0;
                    }

                    if (count >= 5) {
                        check = true;
                        break;
                    }
                }
            }

            // 대각선 오른쪽 아래3
            for (int i = 1; i < n; i++) {
                if (check) break;
                count = 0;
                for (int j = 0; j < n; j++) {
                    int y = i;
                    int x = j;

                    if ((x - y) != 1) continue;
                    if ((x - y) == 1) {
                        if (matrix[y][x] == matrix[y + 1][x + 1]) count++;
                        if (matrix[y][x] != matrix[y + 1][x + 1]) count = 0;
                    }
                    if (count >= 5) {
                        check = true;
                        break;
                    }
                }
            }

            // 대각선 오른쪽 위1
            for (int i = 0; i < n; i++) {
                if (check) break;
                count = 0;
                for (int j = 0; j < n; j++) {

                }
            }
        }
    }
}

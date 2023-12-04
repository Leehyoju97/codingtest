package swexpertacademy.q1954;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] dx = {0, 1, 0, -1};   // 우 하 좌 상
        int[] dy = {1, 0, -1, 0};

        for (int tc = 1; tc <= t; tc++) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];

            int count = 1;
            int x = 0;
            int y = 0;
            int d = 0;

            while (count <= n * n) {
                arr[x][y] = count++;
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
                    d = (d + 1) % 4;
                    nx = x + dx[d];
                    ny = y + dy[d];
                }

                x = nx;
                y = ny;
            }

            System.out.printf("#%d\n", tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}

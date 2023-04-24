package swexpertacademy.q2001;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {

                for (int j = 0; j < N - M + 1; j++) {
                    int sum = 0;

                    for (int k = 0; k < M; k++) {

                        for (int l = 0; l < M; l++) {
                            sum += arr[i + k][j + l];
                        }
                    }

                    if(max < sum) {
                        max = sum;
                    }
                }
            }

            System.out.printf("#%d %d\n", tc, max);
        }
    }
}
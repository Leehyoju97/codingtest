package swexpertacademy.q2005;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];

            System.out.printf("#%d\n", i);

            for (int j = 0; j < n; j++) {

                for (int k = 0; k <= j; k++) {

                    if (k == 0 || j == k) {
                        arr[j][k] = 1;
                        continue;
                    }

                    arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
                }

                for (int k = 0; k <= j; k++) {
                    System.out.printf("%d ", arr[j][k]);
                }

                System.out.println();
            }
        }
    }
}

package swexpertacademy.q1959;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }

            for (int i = 0; i < m; i++) {
                arr2[i] = scanner.nextInt();
            }

            int max = Integer.MIN_VALUE;

            if (n > m) {
                int[] arr3 = new int[n - m + 1];

                for (int i = 0; i < n - m + 1; i++) {
                    for (int j = 0; j < m; j++) {
                        arr3[i] += arr1[j + i] * arr2[j];
                    }

                    max = Math.max(max, arr3[i]);
                }
            } else if (m > n) {
                int[] arr3 = new int[m - n + 1];

                for (int i = 0; i < m - n + 1; i++) {
                    for (int j = 0; j < n; j++) {
                        arr3[i] += arr1[j] * arr2[j + i];
                    }

                    max = Math.max(max, arr3[i]);
                }
            } else {
                max = 0;
                for (int i = 0; i < n; i++) {
                    max += arr1[i] * arr2[i];
                }
            }

            System.out.printf("#%d %d\n", tc, max);
        }
    }
}

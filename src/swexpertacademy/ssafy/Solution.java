package swexpertacademy.ssafy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // 오름차순 정렬
            Arrays.sort(arr);

            int max = 0;

            for (int i = 0; i < n; i++) {
                int temp = 0;

                for (int j = i; j < n; j++) {
                    if (arr[j] - arr[i] <= k) {
                        temp++;
                    }
                }

                if (temp > max) max = temp;
            }

            System.out.printf("#%d %d\n", tc, max);
        }
    }
}

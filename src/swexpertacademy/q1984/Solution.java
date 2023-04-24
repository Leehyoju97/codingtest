package swexpertacademy.q1984;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int[] arr = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = scanner.nextInt();
            }

            Arrays.sort(arr);

            double sum = 0;

            for (int j = 1; j < arr.length - 1; j++) {
                sum += arr[j];
            }

            System.out.printf("#%d %d\n", tc, Math.round(sum / 8));
        }
    }
}

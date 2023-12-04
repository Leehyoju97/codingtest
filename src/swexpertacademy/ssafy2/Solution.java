package swexpertacademy.ssafy2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
            }
        }
    }
}

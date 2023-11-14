package swexpertacademy.q1966;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            System.out.printf("#%d ", i);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[j]);
            }
            System.out.println();
        }
    }
}

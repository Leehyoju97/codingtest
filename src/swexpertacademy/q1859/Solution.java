package swexpertacademy.q1859;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }

            long sum = 0;
            int max = 0;

            for (int j = arr.length - 1; j >= 0; j--) {
                if(max < arr[j]) {
                    max = arr[j];
                }

                if(arr[j] < max) {
                    sum += max - arr[j];
                }
            }

            System.out.println("#" + i + " " + sum);
        }
    }
}

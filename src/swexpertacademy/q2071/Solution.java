package swexpertacademy.q2071;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T ; i++) {
            int[] arr = new int[10];
            double sum = 0;
            int average = 0;

            for (int j = 0; j < 10; j++) {
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }

            System.out.printf("#%d %d\n", i, Math.round(sum / 10));
        }
    }
}

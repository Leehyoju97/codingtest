package swexpertacademy.q2072;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int[] arr = new int[10];
            int sum = 0;

            for (int j = 0; j < 10; j++) {
                arr[j] = scanner.nextInt();
            }

            for(int k = 0; k < 10; k++) {
                if(arr[k] % 2 == 1) {
                    sum += arr[k];
                }
            }

            System.out.printf("#%d %d\n", i, sum);
        }
    }
}

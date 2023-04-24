package swexpertacademy.q2068;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int[] arr = new int[10];
            int max = 0;

            for (int j = 0; j < 10; j++) {
                arr[j] = scanner.nextInt();

                if(max < arr[j]){
                    max = arr[j];
                }
            }

            System.out.printf("#%d %d\n", i, max);
        }
    }
}

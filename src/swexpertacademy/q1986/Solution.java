package swexpertacademy.q1986;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int number = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += (i % 2 == 1) ? i : - i;
            }

            System.out.printf("#%d %d\n", tc, sum);
        }
    }
}

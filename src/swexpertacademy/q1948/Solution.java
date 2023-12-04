package swexpertacademy.q1948;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int tc = 1; tc <= t; tc++) {
            int month1 = scanner.nextInt();
            int day1 = scanner.nextInt();

            int month2 = scanner.nextInt();
            int day2 = scanner.nextInt();

            int result = 0;

            if (month1 == month2) {
                result = day2 - day1 + 1;
            } else {
                for (int i = month1; i < month2 - 1; i++) {
                    result += date[i];
                }
                result += (date[month1 - 1] - day1 + 1);
                result += day2;
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}

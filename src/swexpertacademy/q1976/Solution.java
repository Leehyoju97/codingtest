package swexpertacademy.q1976;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int hour1 = scanner.nextInt();
            int minute1 = scanner.nextInt();

            int hour2 = scanner.nextInt();
            int minute2 = scanner.nextInt();

            int minute = minute1 + minute2;
            int hour = hour1 + hour2;

            if (minute > 60) {
                minute -= 60;
                hour += 1;
            }

            if (hour > 12) {
                hour -= 12;
            }

            System.out.printf("#%d %d %d\n", i, hour, minute);
        }
    }
}

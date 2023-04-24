package swexpertacademy.q2070;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {
                System.out.printf("#%d >\n", i);
            } else if (a == b) {
                System.out.printf("#%d =\n", i);
            } else if(a < b) {
                System.out.printf("#%d <\n", i);
            }
        }
    }
}

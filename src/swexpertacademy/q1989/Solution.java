package swexpertacademy.q1989;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = scanner.next();

            int result = 1;
            for (int i = 0; i < str.length() /2 + 1; i++) {
                if(str.charAt(i) != str.charAt(str.length() - i - 1 )) {
                    result = 0;
                    break;
                }
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}

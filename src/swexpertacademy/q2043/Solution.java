package swexpertacademy.q2043;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;

        if (p >= k) {
            result = p - k + 1;
        } else {
            result = k - p + 1000;
        }

        System.out.println(result);
    }
}

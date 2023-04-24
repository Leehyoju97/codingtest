package swexpertacademy.q2050;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String[] numStr = str.split("");

        for (String s : numStr) {
            int n = s.charAt(0) - 64;
            System.out.printf("%d ", n);
        }
    }
}

package swexpertacademy.q1926;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1 ; i <= N; i++) {
            String s = String.valueOf(i);

            if(s.contains("3") || s.contains("6") || s.contains("9")) {
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);

                    if(c == '3' || c == '6' || c == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

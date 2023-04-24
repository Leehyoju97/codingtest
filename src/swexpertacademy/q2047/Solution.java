package swexpertacademy.q2047;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();

        for (char c: arr) {
            if(c >= 'a' && c <= 'z') {
                c = Character.toUpperCase(c);
            }

            System.out.printf("%c", c);
        }

    }
}

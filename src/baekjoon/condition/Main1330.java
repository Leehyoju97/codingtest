package baekjoon.condition;

import java.util.Scanner;

public class Main1330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String answer = null;

        if (a > b) {
            answer = ">";
        } else if (a < b) {
            answer = "<";
        } else if (a == b) {
            answer = "==";
        }

        System.out.println(answer);
    }
}

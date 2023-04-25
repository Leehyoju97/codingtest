package baekjoon.loop;

import java.util.Scanner;

public class Main10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] answer = new int[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            answer[i] = a + b;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}

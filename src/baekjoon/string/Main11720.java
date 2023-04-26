package baekjoon.string;

import java.util.Scanner;

public class Main11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        String[] sArr = str.split("");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(sArr[i]);
        }

        System.out.println(sum);
    }
}

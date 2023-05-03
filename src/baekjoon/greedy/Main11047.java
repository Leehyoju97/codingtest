package baekjoon.greedy;

import java.util.Scanner;

public class Main11047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {

            if (k == 0) break;

            while (k >= a[i]) {
                k -= a[i];
                cnt++;
            }

        }

        System.out.println(cnt);
    }
}

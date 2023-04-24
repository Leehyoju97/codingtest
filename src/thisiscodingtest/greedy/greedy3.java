package thisiscodingtest.greedy;

import java.util.Scanner;

public class greedy3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {

            int min = 10001;
            for (int j = 0; j < m; j++) {
                int x = scanner.nextInt();
                min = Math.min(min, x);
            }
            result = Math.max(result, min);
        }

        System.out.println(result);
    }

}

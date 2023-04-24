package thisiscodingtest.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i= 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[n - 1];
        int second = arr[n - 2];

        for (int i = 0; i < m; i++) {
            sum += (i % 3 == 0 && i != 0) ? second : first;
        }

        System.out.println("sum : "+ sum);
    }
}

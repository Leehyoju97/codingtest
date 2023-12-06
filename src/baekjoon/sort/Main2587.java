package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main2587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        int average = 0;
        int midNum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);
        average = (int) sum / 5;
        midNum = arr[5 / 2];

        System.out.printf("%d\n%d\n", average, midNum);
    }
}

package baekjoon.array;

import java.util.Scanner;

public class Main2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int xMax = 1;
        int yMax = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (max < arr[i][j]) {
                    max = arr[i][j];
                    xMax = i + 1;
                    yMax = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", xMax, yMax);

    }
}

package swexpertacademy.q1974;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] answer = new int[t];

        for (int i = 1; i <= t; i++) {
            int[][] matrix = new int[9][9];
            answer[i - 1] = 1;

            // 입력
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    matrix[j][k] = scanner.nextInt();
                }
            }

            for (int j = 0; j < 9; j++) {
                int[] arr = new int[9];

                for (int k = 0; k < 9; k++) {
                    arr[(matrix[j][k]) - 1]++;
                }

                for (int k = 0; k < 9; k++) {
                    if (arr[k] == 0) {
                        answer[i - 1] = 0;
                        break;
                    }
                }

            }

            for (int j = 0; j < 9; j++) {
                int[] arr = new int[9];

                for (int k = 0; k < 9; k++) {
                    arr[matrix[k][j] - 1]++;
                }

                for (int k = 0; k < 9; k++) {
                    if (arr[k] == 0) {
                        answer[i - 1] = 0;
                        break;
                    }
                }
            }

            for (int j = 0; j <= 6; j += 3) {
                for (int k = 0; k <= 6; k += 3) {
                    int[] arr = new int[9];

                    int row = j + 3;
                    int column = k + 3;

                    for (int l = 0; l < row; l++) {
                        for (int m = 0; m < column; m++) {
                            arr[matrix[l][m] - 1]++;
                        }
                    }

                    for (int l = 0; l < 9; l++) {
                        if (arr[l] == 0) {
                            answer[i - 1] = 0;
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.printf("#%d %d\n", i + 1, answer[i]);
        }
    }
}

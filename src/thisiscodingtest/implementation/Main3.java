package thisiscodingtest.implementation;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDate = scanner.nextLine();
        int row = inputDate.charAt(1) - '0';
        int column = inputDate.charAt(0) - 'a' + 1;

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        int result = 0;
        for (int i = 0; i < 8; i++) {
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];

            if (nextRow >= 1 && nextRow <= 8 && nextColumn >=1 && nextRow <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}

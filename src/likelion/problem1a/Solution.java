package likelion.problem1a;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputString = input.split(" ");
        int[] inputInt = new int[inputString.length];

        // 입력값을 정수로 변환
        for (int i = 0; i < inputString.length; i++) {
            inputInt[i] = Integer.parseInt(inputString[i]);
        }

        // 최대값 구하기
        int max = inputInt[0];

        for (int i = 1; i < inputInt.length; i++) {

            if (max < inputInt[i]) {
                max = inputInt[i];
            }
        }

        System.out.print("최대값:" + max);
    }
}

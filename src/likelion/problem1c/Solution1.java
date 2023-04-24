package likelion.problem1c;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        while (n > 0) {

            int num = n % 10;
            sum += num * num;

            n /= 10;
        }

        System.out.println("자릿수 제곱의 합: " + sum);
    }

}

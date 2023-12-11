package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = divideSum(n);
        System.out.println(result);
    }

    public static int divideSum(int n) {
        int number = 1;

        while (n > number) {
            int temp = number;
            int sum = temp;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (n == sum) {
                return number;
            }
            number++;
        }

        return 0;
    }
}

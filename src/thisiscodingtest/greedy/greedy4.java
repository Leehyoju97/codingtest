package thisiscodingtest.greedy;

import java.util.Scanner;

public class greedy4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int cnt = 0;
        
        while (n != 1) {
            n = (n % k == 0) ? n / k: n - 1;
            cnt++;
        }

        System.out.println("cnt = " + cnt);
    }
    
}

package swexpertacademy.q2056;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int tc = 1; tc <= t; tc++) {
            String data = sc.next();
            String year = data.substring(0, 4);
            String month = data.substring(4, 6);
            String day = data.substring(6, 8);

            String result = "-1";
            if (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= days[Integer.parseInt(month)]) {
                result = (year + "/" + month + "/" + day);
            }

            System.out.println("#" + tc + " " + result);
        }
    }
}



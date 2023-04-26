package baekjoon.string;

import java.util.Scanner;

public class Main1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] sArr = str.split(" ");
        int count = 0;

        for (String s : sArr) {
            if (!s.equals("")) {
                count++;
            }
        }

        System.out.println(count);
    }
}

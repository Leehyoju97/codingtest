package thisiscodingtest.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class greedy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0 ; i < s.length(); i++) {
            arrayList.add(String.valueOf(s.charAt(i)));
        }

        int answer = Integer.parseInt(arrayList.get(0));

        for (int i = 1; i < s.length(); i++) {
            int number = Integer.parseInt(arrayList.get(i));

            if (answer <= 1 || number <= 1) {
                answer += number;
            } else {
                answer *= number;
            }
        }

        System.out.println("answer = " + answer);
    }
}

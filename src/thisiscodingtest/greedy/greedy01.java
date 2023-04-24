package thisiscodingtest.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class greedy01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        ArrayList<Integer> testcase = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            testcase.add(scanner.nextInt());
        }

        //오름차순 정렬
        Collections.sort(testcase);

        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;

            if(testcase.get(i) <= count) {
                answer++;
                count = 0;
            }
        }

        System.out.println("answer = " + answer);

    }
}

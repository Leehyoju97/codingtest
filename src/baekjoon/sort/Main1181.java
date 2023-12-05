package baekjoon.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];
        
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);    // 사전 순 정렬
                }
                else {
                    return s1.length() - s2.length();   // 길이 짧은 순
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        sb.append(str[0]).append('\n');

        for (int i = 1; i < n; i++) {
            // 중복 출력 x
            if (!str[i].equals(str[i - 1])) {
                sb.append(str[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}

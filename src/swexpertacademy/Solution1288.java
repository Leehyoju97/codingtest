package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            boolean[] check = new boolean[10];
            int number = Integer.parseInt(st.nextToken());
            int increase = 1;

            while (true) {
                int count = 0;
                int temp = number * increase;

                // 0-9 일 경우 true
                while (temp > 0) {
                    check[temp % 10] = true;
                    temp /= 10;
                }

                for (int i = 0; i < 10; i++) {
                    if (check[i] == true) count++;
                    if (check[i] == false) break;
                }

                if (count == 10) {
                    number *= increase;
                    break;
                }

                increase++;
            }
            sb.append("#").append(tc).append(" ").append(number).append("\n");
        }

        System.out.println(sb);
    }
}

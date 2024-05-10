package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution20551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int count;

        for (int tc = 1; tc <= t; tc++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());

            while (num2 >= num3) {
                num2--;
                count++;

                if (num2 == 0) count = -1;
            }
            while (num1 >= num2 && count != -1) {
                num1--;
                count++;

                if (num1 == 0) count = -1;
            }

            sb.append("#").append(tc).append(" ").append(count).append("\n");
        }

        System.out.println(sb);
    }
}

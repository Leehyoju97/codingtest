package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());   // a사 요금
            int q = Integer.parseInt(st.nextToken());   // b사 r리터 이하 1리터당 요금
            int r = Integer.parseInt(st.nextToken());   // b사 요금 기준
            int s = Integer.parseInt(st.nextToken());   // b사 r리터 이상 1리터당 요금
            int w = Integer.parseInt(st.nextToken());   // 한달간 수도의 양

            int a = p * w;
            int b;
            int min;
            if (w <= r) b = q;
            else b = q + (w - r) * s;

            min = Math.min(a, b);
            System.out.printf("#%d %d\n", tc, min);
        }
    }
}

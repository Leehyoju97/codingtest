package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1244 {

    static char[] data;
    static int ans, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            data = st.nextToken().toCharArray();
            ans = 0;
            n = Integer.parseInt(st.nextToken());

            if (n > data.length) n = data.length;

            calc(0, 0);
            sb.append("#" + tc + " " + ans + "\n");
        }
        System.out.println(sb);
    }

    private static void calc(int cnt, int a) {
        if (cnt == n) {
            ans = Math.max(ans, convert());
            return;
        }

        for (int i = a; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                swap(i, j);
                calc(cnt + 1, i);
                swap(i, j);
            }
        }
    }

    private static int convert() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum * 10 + (data[i] - '0');
        }
        return sum;
    }

    private static void swap(int a, int b) {
        char temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}

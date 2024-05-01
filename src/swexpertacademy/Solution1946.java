package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char[] c = new char[n];
            int[] num = new int[n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                c[i] = st.nextToken().charAt(0);
                num[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("#" + tc + "\n");

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < num[i]; j++) {
                    sb.append(c[i]);
                    count++;

                    if (count == 10) {
                        sb.append("\n");
                        count = 0;
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

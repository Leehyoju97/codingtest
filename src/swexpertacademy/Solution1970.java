package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] won = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int[] count = new int[won.length];
            int money = Integer.parseInt(st.nextToken());

            for (int i = 0; i < won.length; i++) {
                count[i] = money / won[i];
                money %= won[i];
            }
            System.out.printf("#%d\n", tc);
            for (int i = 0; i < won.length; i++) {
                System.out.printf("%d ", count[i]);
            }
            System.out.println();
        }
    }
}

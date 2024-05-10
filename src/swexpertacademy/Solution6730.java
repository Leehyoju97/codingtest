package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution6730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int number = Integer.parseInt(br.readLine());
            int[] numbers = new int[number];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < number; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            int up = 0;
            int down = 0;

            for (int i = 0; i < number - 1; i++) {
                int height = numbers[i + 1] - numbers[i];
                if (height > 0 && height > up) {
                    up = height;
                } else if (height < 0) {
                    height = -height;

                    if (down < height) {
                        down = height;
                    }
                }
            }

            sb.append("#").append(tc + " ").append(up + " " + down).append("\n");
        }

        System.out.println(sb);
    }
}

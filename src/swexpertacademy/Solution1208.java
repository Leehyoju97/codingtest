package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int dump = Integer.parseInt(br.readLine());
            int[] boxes = new int[100];
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < 100; i++) {
                boxes[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < dump; i++) {
                Arrays.sort(boxes);
                boxes[0]++;
                boxes[99]--;
            }
            Arrays.sort(boxes);
            int result = boxes[99] - boxes[0];
            sb.append("#" + tc + " " + result + "\n");
        }

        System.out.println(sb);
    }
}

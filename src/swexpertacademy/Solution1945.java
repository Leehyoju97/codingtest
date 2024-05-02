package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[5];
        int[] num = {2, 3, 5, 7, 11};
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= n; tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            int number = Integer.parseInt(st.nextToken());
            sb.append("#" + tc + " ");

            for (int i = 0; i < 5; i++) {
                int count = 0;
                while (number % num[i] == 0) {
                    number /= num[i];
                    count++;
                }
                arr[i] = count;
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

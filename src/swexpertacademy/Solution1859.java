package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            long sum = 0;
            int max = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = n - 1; j >= 0; j--) {
                if (max < arr[j]) {
                    max = arr[j];
                }

                if (max > arr[j]) {
                    sum += max - arr[j];
                }
            }
            sb.append("#").append(i + " " + sum + "\n");
        }

        System.out.println(sb);
    }
}

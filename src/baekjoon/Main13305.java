package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] lines = new long[n - 1];

        for (int i = 0; i < n - 1; i++) {
            lines[i] = Long.parseLong(st.nextToken());
        }

        long[] costs = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            costs[i] = Long.parseLong(st.nextToken());
        }

        long minCost = costs[0];
        long sumMinCost = 0;

        for (int i = 0; i < n - 1; i++) {
            if (costs[i] < minCost) {
                minCost = costs[i];
            }

            sumMinCost += minCost * lines[i];
        }

        System.out.println(sumMinCost);
    }
}

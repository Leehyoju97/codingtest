package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2817 {
    static int[] arr;
    static int n;
    static int k;
    static int sum;
    static int count;
    static int index;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[n];

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            count = 0;
            sum = 0;
            index = 0;
            subSequenceSum(0, 0);
            sb.append("#" + tc + " " + count + "\n");
        }
        System.out.println(sb);
    }

    private static void subSequenceSum(int index, int sum) {
        if (sum == k) {
            count++;
            return;
        }
        if (index == n || sum > k) {
            return;
        }

        subSequenceSum(index + 1, sum + arr[index]);

        subSequenceSum(index + 1, sum);
    }
}

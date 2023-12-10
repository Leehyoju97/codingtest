package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main10815 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        int m = Integer.parseInt(br.readLine());
        int[] card2 = new int[m];

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            // 0보다 크면 해당 값이 존재
            if (Arrays.binarySearch(card, Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }

        System.out.println(sb);
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> owned = new HashMap<>();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            owned.put(st.nextToken(), 0);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (owned.get(st.nextToken()) != null) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}

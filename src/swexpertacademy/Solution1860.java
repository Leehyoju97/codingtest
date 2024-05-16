package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine(), " ");
            int people = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            int[] arrives = new int[people];

            for (int i = 0; i < people; i++) {
                arrives[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrives);
            boolean check = true;
            int amount = 0;
            int index = 0;

            for (int i = 0; i <= Arrays.stream(arrives).max().getAsInt(); i++) {
                if (i % time == 0 && i != 0) amount += count;

                while (i == arrives[index]) {
                    if (amount == 0) {
                        check = false;
                        break;
                    }
                    amount--;
                    index++;

                    if (index == people) break;
                }
            }

            String answer = (check == true) ? "Possible" : "Impossible";
            sb.append("#" + tc + " " + answer + "\n");
        }
        System.out.println(sb);
    }
}

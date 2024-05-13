package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1289 {
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            String memory = br.readLine();
            count = 0;

            if (memory.charAt(0) == '1') count++;

            for (int i = 1; i < memory.length(); i++) {
                if (memory.charAt(i - 1) != memory.charAt(i)) count++;
            }
            sb.append("#" + tc + " " + count + "\n");
        }

        System.out.println(sb);
    }
}

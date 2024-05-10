package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution20019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String answer = "";
        boolean check;

        for (int tc = 1; tc <= t; tc++) {
            check = true;
            String[] str = br.readLine().split("");
            int length = (str.length - 1) / 2;

            for (int i = 0; i < length; i++) {
                if (!str[i].equals(str[str.length - 1 - i])) {
                    check = false;
                    break;
                }
            }

            for (int i = 0; i < length / 2; i++) {
                if (!str[i].equals(str[length - 1 - i]) && check) {
                    check = false;
                    break;
                }
            }

            answer = (check == true) ? "YES" : "NO";
            sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
}

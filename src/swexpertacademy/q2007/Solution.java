package swexpertacademy.q2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        int strLength = 0;

        for (int i = 1; i <= T; i++) {
            String str = bufferedReader.readLine();

            for (int j = 1; j <= 10; j++) {
                String sub1 = str.substring(0, j);
                String sub2 = str.substring(j, j * 2);

                if(sub1.equals(sub2)) {
                    strLength = j;
                    break;
                }
            }

            System.out.printf("#%d %d\n", i, strLength);
        }
    }
}

package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[2];
            int currentSpeed = 0;
            int distance = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());
                int time;
                if (command == 1) {
                    time = Integer.parseInt(st.nextToken());
                    currentSpeed += time;
                } if (command == 2) {
                    time = Integer.parseInt(st.nextToken());
                    currentSpeed -= time;

                    if (currentSpeed < 0) currentSpeed = 0;
                }

                distance += currentSpeed;
            }

            System.out.printf("#%d %d\n", tc, distance);
        }
    }
}

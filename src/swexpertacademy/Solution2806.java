package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2806 {
    static int[] board;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            board = new int[n];
            answer = 0;
            dfs(0, n);
            sb.append("#" + tc + " " + answer + "\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int curr, int n) {
        boolean isPossible;

        // curr == n까지 왔으면 퀸을 정상적으로 다 둘 수 있다는 의미
        if (curr == n) {
            answer++;
            return;
        }
        // i는 열, j는 행, curr은 현재 탐색 중인 행
        for (int i = 0; i < n; i++) {
            isPossible = true;
            for (int j = 0; j < curr; j++) {
                if (board[j] == i || i == board[j] + (curr - j) || i == board[j] - (curr - j)) {
                    isPossible = false;
                    break;
                }
            }
            // 퀸을 둘 수 있는 경우 board[행] = 열
            if (isPossible) {
                board[curr] = i;
                dfs(curr + 1, n);
            }
        }
    }
}

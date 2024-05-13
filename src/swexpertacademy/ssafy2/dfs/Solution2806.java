package swexpertacademy.ssafy2.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2806 {

    static int[] matrix;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            matrix = new int[n];
            answer = 0;
            dfs(0, n);
            sb.append("#" + tc + " " + answer + "\n");
        }

        System.out.println(sb);
    }

    // 아이디어 0행 부터 n-1행까지 정상적으로 탐색하는지 확인
    private static void dfs(int currentRow, int n) {

        boolean isPossible;

        // currentRow가 n이면 n-1행까지 정상적으로 퀸을 둔 것이므로 종료
        if (currentRow == n) {
            answer++;
            return;
        }

        for (int column = 0; column < n; column++) {
            isPossible = true;
            for (int row = 0; row < currentRow; row++) {
                if (column == matrix[row] || column == matrix[row] + (currentRow - row) || column == matrix[row] - (currentRow - row)) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                matrix[currentRow] = column;
                dfs(currentRow + 1, n);
            }
        }
    }
}

package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1493 {
    public static final int NUMBER = 300;
    public static int[][] matrix;
    public static int increaseNum = 1;
    static int px = 0;
    static int py = 0;
    static int qx = 0;
    static int qy = 0;
    static int cx;
    static int cy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        matrix = new int[NUMBER][NUMBER];

        for (int y = 1; y < NUMBER; y++) {
            int x = 1;
            int temp = y;
            while (temp >= 1) {
                matrix[x][temp] = increaseNum;
                x++;
                temp--;
                increaseNum++;
            }
        }

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine()," ");
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            px = 0;
            py = 0;
            qx = 0;
            qy = 0;
            boolean checkP = false;
            boolean checkQ = false;

            for (int i = 1; i < NUMBER; i++) {
                for (int j = 1; j < NUMBER; j++) {
                    if (matrix[i][j] == p) {
                        px = j;
                        py = i;
                        checkP = true;
                    }

                    if (matrix[i][j] == q) {
                        qx = j;
                        qy = i;
                        checkQ = true;
                    }
                }

                if (checkP == true && checkQ == true) break;
            }

            cx = px + qx;
            cy = py + qy;

            sb.append("#" + tc + " " + matrix[cy][cx] + "\n");
        }

        System.out.println(sb);
    }
}

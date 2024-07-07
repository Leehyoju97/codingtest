package swexpertacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1215 {
    static char[][] map;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine());
            map = new char[8][8];
            count = 0;
            
            // 입력값
            for (int row = 0; row < 8; row++) {
                String str = br.readLine();
                for (int column = 0; column < 8; column++) {
                    map[row][column] = str.charAt(column);
                }
            }
            
            // 가로체크
            for (int row = 0; row < 8; row++) {
                for (int column = 0; column <= 8 - n; column++) {
                    boolean check = true;
                    for (int i = 0; i < n / 2; i++) {
                        if (map[row][column + i] != map[row][column + n - 1 - i]) {
                            check = false;
                            break;
                        }
                    }
                    if (check) count++;
                }
            }
            
            // 세로체크
            for (int column = 0; column < 8; column++) {
                for (int row = 0; row <= 8 - n; row++) {
                    boolean check = true;
                    for (int i = 0; i < n / 2; i++) {
                        if (map[row + i][column] != map[row + n - 1 - i][column]) {
                            check = false;
                            break;
                        }
                    }
                    if (check) count++;
                }
            }

            sb.append("#" + tc + " " + count + "\n");
        }
        System.out.println(sb);
    }
}

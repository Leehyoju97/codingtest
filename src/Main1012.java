import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1012 {

    static int weight;  // 가로
    static int height;  // 세로
    static int k;   // 배추 개수
    static int[][] arr; // 배추 위치
    static boolean[][] check; // 배추 있는 위치 지나갔는지

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            weight = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new int[weight][height];
            check = new boolean[weight][height];

            // 배추 위치 배열에 표시
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;
            }

            int count = 0;  // 지렁이 최소개수

            for (int j = 0; j < weight; j++) {
                for (int l = 0; l < height; l++) {
                    if (arr[j][l] == 1 && !check[j][l]) {
//                        bfs(j, l);
                        dfs(j, l);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int startDx, int startDy) {
        Queue<int[]> queue = new LinkedList<>();

        // 시작 좌표 저장
        queue.offer(new int[]{startDx, startDy});

        // 시작 좌표 지나감 표시
        check[startDx][startDy] = true;

        int[] dx = {0, 0, -1, 1}; // 상하좌우
        int[] dy = {-1, 1, 0, 0};

        // 큐가 비어있으면 인접한 배추가 존재하지 않는다.
        while (!queue.isEmpty()) {
            // 시작 좌표 꺼내기
            int[] poll = queue.poll();

            // 시작좌표로부터 상하좌우 확인
            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];

                // 밭을 벗어나는 경우 제외
                if (x < 0 || x >= weight || y < 0 || y >= height) {
                    continue;
                }

                // 배추가 있고 지나가지 않은 좌표인 경우 큐에 넣고, 지나갔다는 표시
                if (arr[x][y] == 1 & !check[x][y]) {
                    queue.offer(new int[] {x, y});
                    check[x][y] = true;
                }
            }
        }
    }

    private static void dfs(int startDx, int startDy) {
        // 시작 좌표 지나감 표시
        check[startDx][startDy] = true;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int x = startDx + dx[i];
            int y = startDy + dy[i];

            if (x < 0 || x >= weight || y < 0 || y >= height) {
                continue;
            }

            if (arr[x][y] == 1 & !check[x][y]) {
                dfs(x, y);
            }
        }
    }
}

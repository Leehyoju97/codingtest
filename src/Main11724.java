import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11724 {
    static int nodes;
    static int lines;
    static ArrayList<Integer> list[];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        nodes = Integer.parseInt(st.nextToken());
        lines = Integer.parseInt(st.nextToken());
        list = new ArrayList[nodes + 1];

        for (int i = 1; i <= nodes; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        int count = 0;
        visited = new boolean[nodes + 1];

        for (int i = 1; i <= nodes; i++) {
            if (visited[i]) continue;
//            dfs(i);
            bfs(i);
            count++;
        }

        System.out.println(count);
    }

    public static void dfs(int s) {
        visited[s] = true;
        for (int e : list[s]) {
            if (visited[e]) continue;
            dfs(e);
        }
    }

    public static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : list[now]) {
                if (visited[next]) continue;
                queue.offer(next);
                visited[next] = true;
            }
        }
    }
}

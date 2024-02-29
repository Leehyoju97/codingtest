import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2644 {
    static int n;
    static int start;
    static int end;
    static int m;
    static int parent;
    static int child;
    static List<Integer> list[];
    static boolean[] checked;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        checked = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            parent = Integer.parseInt(st.nextToken());
            child = Integer.parseInt(st.nextToken());
            list[parent].add(child);
            list[child].add(parent);
        }

        dfs(start, end, 0);
        System.out.println(result);
    }

    public static void dfs(int start, int end, int count) {
        if (start == end) {
            result = count;
            return;
        }

        checked[start] = true;

        for (int i = 0; i < list[start].size(); i++) {
            int next = list[start].get(i);

            if (!checked[next]) {
                dfs(next, end, count + 1);
            }
        }
    }
}

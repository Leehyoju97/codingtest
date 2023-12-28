package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.add(new Balloon(i, move));
        }

        // 풍선이 하나 남을 때까지 진행
        while (deque.size() > 1) {
            // 현재 풍선
            Balloon cur = deque.poll(); // poll == pollFirst
            sb.append(cur.position).append(" ");
            int move = cur.move;

            if (move > 0) {
                move--; // poll을 하면 오른쪽에 있는 풍선으로 자리 이동하기 때문에 한칸 빼줘야 한다.

                while (move != 0) {
                    move--;
                    deque.addLast(deque.pollFirst());
                }
            } else if (move < 0) {
                while (move != 0) {
                    move++;
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        sb.append(deque.poll().position);
        System.out.println(sb);
    }
}

class Balloon {
    int position;
    int move;

    public Balloon(int position, int move) {
        this.position = position;
        this.move = move;
    }
}

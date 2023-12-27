package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int option = Integer.parseInt(st.nextToken());

            if (option == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (option == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (option == 3) {
                if (!deque.isEmpty()) {
                    sb.append(deque.pollFirst()).append('\n');
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (option == 4) {
                if (!deque.isEmpty()) {
                    sb.append(deque.pollLast()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (option == 5) {
                sb.append(deque.size()).append("\n");
            } else if (option == 6) {
                if (deque.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (option == 7) {
                if (!deque.isEmpty()) {
                    sb.append(deque.peekFirst()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (option == 8) {
                if (!deque.isEmpty()) {
                    sb.append(deque.peekLast()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }

        System.out.println(sb);
    }
}

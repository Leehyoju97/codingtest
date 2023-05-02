package baekjoon.datastructure;

import java.io.*;
import java.util.Stack;

public class Main10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            if (str[0].equals("push")) {
                int num = Integer.parseInt(str[1]);
                stack.push(num);
            } else if (str[0].equals("top")) {
                System.out.println((stack.isEmpty()) ? -1 : stack.peek());
            } else if (str[0].equals("pop")) {
                System.out.println((stack.isEmpty()) ? -1 : stack.pop());
            } else if (str[0].equals("size")) {
                System.out.println(stack.size());
            } else if (str[0].equals("empty")) {
                System.out.println((stack.isEmpty()) ? 1 : 0);
            }
        }
    }
}

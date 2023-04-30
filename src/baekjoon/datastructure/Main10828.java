package baekjoon.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class Main10828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int num = sc.nextInt();
                stack.push(num);
            } else if (cmd.equals("top")) {
                System.out.println((stack.isEmpty()) ? -1 : stack.peek());
            } else if (cmd.equals("pop")) {
                System.out.println((stack.isEmpty()) ? -1 : stack.pop());
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                System.out.println((stack.isEmpty()) ? 1 : 0);
            }
        }
    }
}

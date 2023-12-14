package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main28278 {
    static int top = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int option = Integer.parseInt(st.nextToken());

            if (option == 1) {
                int inputNumber = Integer.parseInt(st.nextToken());
                input(stack, inputNumber);
            } else if (option == 2) {
                sb.append(hasNumber(stack)).append('\n');
            } else if (option == 3) {
                sb.append(numberLength()).append('\n');
            } else if (option == 4) {
                sb.append(emptyStack()).append('\n');
            } else if (option == 5) {
                sb.append(peek(stack)).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static void input(int[] stack, int inputNumber) {
        stack[top++] = inputNumber;
    }

    public static int hasNumber(int[] stack) {
        if (top == 0) {
            return -1;
        }

        return stack[--top];
    }

    public static int numberLength() {
        return top;
    }

    public static int emptyStack() {
        if (top == 0) {
            return 1;
        }
        return 0;
    }

    public static int peek(int[] stack) {
        if (top == 0) {
            return -1;
        }
        return stack[top - 1];
    }
}

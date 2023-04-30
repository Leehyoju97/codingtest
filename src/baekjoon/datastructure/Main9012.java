package baekjoon.datastructure;

import java.util.Scanner;
import java.util.Stack;


/*
* 9012 생각해보기

n 입력
1차 String 배열에  저장

각 문자열을  split으로 쪼개훈 Stack 클래스 활용

조건문

1. stack이 비어있을 경우  : push

2. 현재 ) 일 때 peek을 했을 때 ( 일 경우 pop한다.

3. push

조건문 결과

4. stack이 완전히 비었는지 체크

5. stack 비워주기 clear()
* */

public class Main9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] sArr = new String[n];
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            sArr[i] = sc.next();
        }

        Stack stack = new Stack();

        for (int i = 0; i < n; i++) {

            int length = sArr[i].length();

            String[] tempArr = new String[length];
            tempArr = sArr[i].split("");

            for (int j = 0; j < length; j++) {

                if (stack.empty()) {
                    stack.push(tempArr[j]);
                } else if (tempArr[j].equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    stack.push(tempArr[j]);
                }

            }

            answer[i] = (stack.empty()) ? "YES" : "NO";
            stack.clear();
        }


        for (String s : answer) {
            System.out.println(s);
        }
    }
}

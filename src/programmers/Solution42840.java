package programmers;

import java.util.Arrays;

public class Solution42840 {

    int[] array1 = new int[10000];
    int[] array2 = new int[10000];
    int[] array3 = new int[10000];

    int[] rule1 = {1, 2, 3, 4, 5};
    int[] rule2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] rule3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] result;

    // 규칙에 맞게 배열에 값 넣어주는 메소드
    public void insert(int[] array, int[] rule) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rule[index];

            index++;

            if (index == rule.length) {
                index = 0;
            }
        }
    }

    // 최대로 맞은 사람 확인
    public int[] check(int[] answers) {
        insert(array1, rule1);
        insert(array2, rule2);
        insert(array3, rule3);

        int[] correct = new int[3];

        // 각 사람의 맞은 개수 구하기
        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == array1[i]) {
                correct[0]++;
            }

            if (answers[i] == array2[i]) {
                correct[1]++;
            }

            if (answers[i] == array3[i]) {
                correct[2]++;
            }
        }

        int max = correct[0];

        // 최대로 맞은 문제 개수 구하기
        for (int i = 0; i < correct.length; i++) {

            if (max < correct[i]) {
                max = correct[i];
            }
        }

        int index = 0;
        int[] temp = new int[3];

        for (int i = 0; i < correct.length; i++) {

            if (max == correct[i]) {
                temp[index] = i + 1;
                index++;
            }
        }

        result = new int[index];

        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public int[] solution(int[] answers) {

        int[] result = check(answers);

        return result;
    }

    public static void main(String[] args) {
        Solution42840 s = new Solution42840();
        int[] answers = {1,3,2,4,2};

        int[] result = s.solution(answers);

        System.out.println(Arrays.toString(result));
    }
}

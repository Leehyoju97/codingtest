package programmers;

import java.util.Arrays;

public class Solution42748 {

    public int[] solution(int[] array, int[][] commands) {
        int answerSize = commands.length;
        int[] answer = new int[answerSize];

        for (int i = 0; i < answer.length; i++) {
            int[] arr = cutArray(array, commands, i);
            findIndex(answer, arr, commands[i][2], i);
        }

        return answer;
    }

    // 배열 자르기
    private int[] cutArray(int[] array, int[][] commands, int i) {

        int size = commands[i][1] - commands[i][0] + 1;

        int[] arr = new int[size];

        int index = commands[i][0] - 1;

        for (int j = 0; j < size; j++) {
            arr[j] = array[index];
            index++;
        }

        return arr;
    }

    // k번째 있는 수 구하기
    private void findIndex(int[] answer, int[] arr, int idx, int i) {
        // 배열 정렬
        Arrays.sort(arr);

        answer[i] = arr[idx - 1];
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution42748 solution42748 = new Solution42748();
        int[] result = solution42748.solution(array, command);
        System.out.println(Arrays.toString(result));
    }
}

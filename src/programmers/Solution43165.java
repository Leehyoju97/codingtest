package programmers;

public class Solution43165 {

    int[] numbers;
    int target;
    int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0,0);

        return answer;
    }

    private void dfs(int index, int sum) {

        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int result = new Solution43165().solution(numbers, target);
        System.out.println("result = " + result);
    }
}

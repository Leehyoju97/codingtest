package swexpertacademy.q1983;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            ArrayList<Double> scores = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int midScore = scanner.nextInt();
                int finalScore = scanner.nextInt();
                int assignmentScore = scanner.nextInt();

                double totalScore = midScore * 0.35 + finalScore * 0.45 + assignmentScore * 0.2;
                scores.add(totalScore);
            }

            double k_score = scores.get(k - 1);
            Collections.sort(scores, Collections.reverseOrder());

            int value = n / 10;
            int result = scores.indexOf(k_score) / value;

            System.out.println("#" + i + " " + grades[result]);
        }
    }
}

package baekjoon.condition;

import java.util.Scanner;

public class Main9498 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String grade;

        if (n >= 90 && n <= 100) {
            grade = "A";
        } else if (n >= 80 && n < 90){
            grade = "B";
        } else if (n >= 70 && n < 80) {
            grade = "C";
        } else if (n >= 60 && n < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
    }
}

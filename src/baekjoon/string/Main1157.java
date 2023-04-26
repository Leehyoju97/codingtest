package baekjoon.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        char[] cArr = str.toCharArray();

        HashMap<Character, Integer> wordMap = new HashMap<>();
        HashSet<Character> wordSet = new HashSet<>();

        for (char c : cArr) {

            if (wordSet.contains(c)) {
                wordMap.put(c, wordMap.get(c) + 1);
            } else {
                wordMap.put(c, 1);
            }

            wordSet.add(c);
        }

        char maxKey = ' ';
        int maxValue = 0;

        for (char key : wordMap.keySet()) {
            int value = wordMap.get(key);

            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            } else if (value == maxValue) {
                maxKey = '?';
            }
        }

        System.out.println(maxKey);

    }
}

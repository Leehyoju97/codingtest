package thisiscodingtest.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class greedy03 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s, "0");
        StringTokenizer st0 = new StringTokenizer(s, "1");
        System.out.println("st1 :" + st1.countTokens());
        System.out.println("st2: " + st0.countTokens());
        System.out.println(Math.min(st1.countTokens(), st0.countTokens()));
    }

    public static void main(String[] args) throws Exception {
        new greedy03().solution();
    }
}

package swexpertacademy.q2063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution{
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int midNum=(Integer.parseInt(br.readLine())-1)/2;
        String[] input=br.readLine().split(" ");
        int[] inputI=new int[input.length];
        for(int i=0;i<input.length;i++) {
            inputI[i]=Integer.parseInt(input[i]);
        }
        Arrays.sort(inputI);
        System.out.println(inputI[midNum]);

    }
}

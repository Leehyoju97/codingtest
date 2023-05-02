package baekjoon.datastructure;

import java.io.*;

public class Main1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] brr = br.readLine().split(" ");
        boolean[] flag = new boolean[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(brr[i].equals(arr[j])) {
                    flag[i] = true;
                    break;
                }
            }
        }

        for (boolean f : flag) {
            if (f) {
                bw.write(1  +"\n");
            } else {
                bw.write(0 + "\n");
            }
        }

        bw.flush();
    }
}

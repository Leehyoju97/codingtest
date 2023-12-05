package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        // 오름차순 정렬
        Collections.sort(list);

        // StringBuilder에 저장했다가 한번에 출력 -> 시간 초과를 피하기 위해
        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}

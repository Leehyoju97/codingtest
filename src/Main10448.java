import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[45];

        for (int i = 1; i < 45; i++) {
            arr[i] = i * (i + 1) / 2;
        }

        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
            sb.append(eureka(arr, input[i])).append("\n");
        }

        System.out.println(sb);
    }

    public static int eureka(int[] arr, int number) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    if (number == (arr[i] + arr[j] + arr[k])) return 1;
                }
            }
        }
        return 0;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int except1 = 0;
        int except2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    except1 = i;
                    except2 = j;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            if (i != except1 && i != except2) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}

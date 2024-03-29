public class Main4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int number = d(i);

            if (number < 10001) {
                arr[number] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}

package programmers;

import java.util.HashSet;
import java.util.Iterator;

public class Solution42839 {

    HashSet<Integer> numberSet = new HashSet<>();

    // 모든 조합 구하기
    public void combination(String str, String others) {

        if (!str.equals(""))
            numberSet.add(Integer.valueOf(str));

        for (int i = 0; i < others.length(); i++)
            combination(str + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
    }

    // 소수 판별
    public boolean isPrime(int number) {

        if (number == 0 || number == 1)
            return false;

        int limit = (int) Math.sqrt(number);

        for (int i = 2; i <= limit; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public int solution(String numbers) {
        int count = 0;
        combination("", numbers);

        Iterator<Integer> it = numberSet.iterator();

        while (it.hasNext()) {
            int number = it.next();

            if (isPrime(number))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Solution42839 s = new Solution42839();
        String numbers = "17";

        int result = s.solution(numbers);
        System.out.println(result);
    }
}

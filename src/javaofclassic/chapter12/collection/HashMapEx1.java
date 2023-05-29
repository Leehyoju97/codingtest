package javaofclassic.chapter12.collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myid", "1234");
        map.put("asdf", "1111");

        // 동일한 키값이 들어오면 값이 수정된다.
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");

            // trim 사용시 띄어쓰기를 제거해준다.
            String id = s.nextLine().trim();

            System.out.print("password : ");
            String password = s.nextLine().trim();

            // hashmap 안에 key값이 존재하는지 검사
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");

                continue;
            }

            // value가 같은지 검사
            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}

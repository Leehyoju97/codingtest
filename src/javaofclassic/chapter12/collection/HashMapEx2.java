package javaofclassic.chapter12.collection;

import java.util.*;

public class HashMapEx2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        // map에 key, value 입력
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        // 키, 값 가져오기
        Set set = map.entrySet();

        System.out.println("entrySet 출럭 : " + set);
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        // 키만 가져오기
        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        // map에 저장된 값만
        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = (int) it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}

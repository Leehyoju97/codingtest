package javaofclassic.chapter12.generic;

import java.util.*;

class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            //  Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
            Student s = it.next();
            System.out.println(s.name);
        }

        System.out.println("======================");

        HashMap<String, Student> map = new HashMap<>();

        map.put("자바왕", new Student("자바왕", 1, 1));
        map.put("자바짱", new Student("자바짱", 1, 2));
        map.put("홍길동", new Student("홍길동", 2, 1));

        Iterator<Map.Entry<String, Student>> it2 = map.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<String, Student> entry = it2.next();
            System.out.println(entry.getKey() + " : " + entry.getValue().no);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}

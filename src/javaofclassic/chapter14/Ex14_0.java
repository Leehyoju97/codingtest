package javaofclassic.chapter14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {
        // 람다식
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        System.out.println(f.apply("100") + 200);   // 300

        // 메소드 참조
        Function<String, Integer> f2 = Integer::parseInt;
        System.out.println(f.apply("200") + 500);   // 700


        // Supplier는 입력 x, 출력 ㅇ
        Supplier<MyClass> s = () -> new MyClass();
        System.out.println(s.get());  // javaofclassic.chapter14.MyClass@880ec60

        MyClass mc = s.get();
        System.out.println(mc); // javaofclassic.chapter14.MyClass@3f3afe78

        // 메서드 참조로 변환   클래스 이름::메서드이름
        Supplier<MyClass> s2 = MyClass::new;
        System.out.println(s2.get());   //javaofclassic.chapter14.MyClass@36d64342

        // Function은 입력ㅇ 출력ㅇ 람다식으로 표현
        Function<Integer, MyClass2> ff = (i) -> new MyClass2(i);
        MyClass2 mc2 = ff.apply(100);
        System.out.println(mc2.iv); // 100

        //Function 메소드 참조로 변환
        Function<Integer, MyClass2> ff2 = MyClass2::new;
        System.out.println(ff2.apply(500).iv);  // 500

        // 배열길이 입력 -> int형 배열 출력
        Function<Integer, int[]> ff3 = (i) -> new int[i];
        System.out.println(ff3.apply(333).length);  //333

        // 메소드 참조로 변환
        Function<Integer, int[]> ff4 = int[]::new;
    }
}

class MyClass{}

class MyClass2{
    int iv;

    public MyClass2(int iv) {
        this.iv = iv;
    }
}

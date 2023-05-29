package javaofclassic.chapter12.annotationex;


class Parent {
    void parentMethod() { }
}

@FunctionalInterface    //함수형 인터페이스는 하나의 추상 메소드만 가능
interface Testable {
    void test();    //추상 메소드
    //void check(); // 추상 메소드
}


class Child extends Parent {
    @Override   //오버라이딩
    @Deprecated // 사용하지 말라고 권장
    void parentMethod() { } // 조상 메서드의 이름을 잘못 적었음.
}

public class Ex12_7 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
    }
}

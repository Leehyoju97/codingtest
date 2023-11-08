package javaofclassic.chapter14;

public class Ex14_0a {

    public static void main(String[] args) {
        MyFunction2 obj = new MyFunction2() {
            // 오버라이딩 - 접근제어자는 좁게 바꿀 수 없다.   //상위클래스가 public이므로 public만 사용가능
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int value = obj.max(3, 5);
        System.out.println("value = " + value);

        // 람다식 사용
        MyFunction2 f = (a, b) -> a > b ? a : b;
        System.out.println("value = " + f.max(10, 4));

    }
}

// 함수형인터페이스 어노테이션 사용 함수형 인터페이스 안에는 단 하나의 추상 메소드만 있어야 한다.
@FunctionalInterface
interface MyFunction2 {
    // public abstract int max(int a, int b);
    int max(int a, int b);  // 인터페이스 안에서는 public abstract가 생략되어 있다.
}

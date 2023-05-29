package javaofclassic.chapter12.generic;

import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Tv> tvList1 = new ArrayList<>();
//  	ArrayList<Product> tvList2 = new ArrayList<Tv>(); // 에러. 이유 : 타입 변수가 불일치하므로
 		List<Tv> tvList3 = new ArrayList<>(); // OK. 다형성

        productList.add(new Tv());  // Product를 상속 받은 하위 클래스
        productList.add(new Audio());

        tvList1.add(new Tv());
        tvList1.add(new Tv());

        printAll(productList);
//        printAll(tvList1); // 컴파일 에러가 발생한다. 이유 : 타입 변수가 불일치하므로
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            System.out.println(p);  //toString값 출력
    }
}
package javaofclassic.chapter12.generic;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
// 에러. FruitBox클래스의 타입변수는 Fruit클래스와 Eatable인터페이스를 상속받아야 하는데 toy는 해당클래스를 상속 받지 않았다.
//		FruitBox<Toy>   toyBox   = new FruitBox<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 하위클래스가 아님
        grapeBox.add(new Grape());

        System.out.println("fruitBox-"+fruitBox.list);
        System.out.println("appleBox-"+appleBox.toString());
        System.out.println("grapeBox-"+grapeBox);   //grapeBox.toString()
    }  // main
}

/*
FruitBox 클래스는 Box 제너릭 클래스를 상속받으면서
타입변수는 Fruit클래스와 Eatable 인터페이스
를 상속받는다.
즉 FruitBox의 타입변수에 제한을 줄 수 있다.
*/
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);     }
    T get(int i)     { return list.get(i); }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}

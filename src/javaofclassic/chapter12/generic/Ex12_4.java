package javaofclassic.chapter12.generic;

import java.util.ArrayList;

class Fruit2		       	{ public String toString() { return "Fruit";}}
class Apple2 extends Fruit2	{ public String toString() { return "Apple";}}
class Grape2 extends Fruit2	{ public String toString() { return "Grape";}}

class Juice {
    String name;

    Juice(String name)       { this.name = name + "Juice"; }
    public String toString() { return name;                }
}

class Juicer {
    /*
    * makeJuice의 매개변수로 FruitBox의 타입변수를 extends를 활용하여
    * 지정해준다.즉 Fruits를 상속받고 있는 클래스는 Fruits클래스의 타입
    * 변수로 사용이 가능하다.
    * */

    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        /*
        * box라는 인스턴스 안에 있는 리스트를 tmp로 붙여주는 작업을 하는 중이다.
        * 다 붙이고 나서 Juice의 생성자의 매개변수에 넣어준다.
        * */

        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }

    /*
    static <T extends Fruit2> Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        *//*
         * box라는 인스턴스 안에 있는 리스트를 tmp로 붙여주는 작업을 하는 중이다.
         * 다 붙이고 나서 Juice의 생성자의 매개변수에 넣어준다.
         * *//*
        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
    */

    /*
    static <T extends Fruit2> Juice makeJuice(FruitBox2<T> box) {
        String tmp = "";

        *//*
         * box라는 인스턴스 안에 있는 리스트를 tmp로 붙여주는 작업을 하는 중이다.
         * 다 붙이고 나서 Juice의 생성자의 매개변수에 넣어준다.
         * *//*
        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
    */
}

class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<>();
        FruitBox2<Apple2> appleBox = new FruitBox2<>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        // makeJuice는 static 메소드이므로 클래스명으로 호출가능
        System.out.println(Juicer.makeJuice(fruitBox).toString());
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i);  }
    ArrayList<T> getList() { return list;   }
    int size()       { return list.size();  }
    public String toString() { return list.toString();}
}

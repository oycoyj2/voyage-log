package com.project;
class Outer {
    int a = 1;
    String b = "Hello";

    class Inner {
        void printHello(String name) {
            System.out.println(b + name);
        }
    }


}


public class InnerClassEx {
    public static void main(String[] args) {
        Outer outer = new Outer();                  // 먼저 외부 클래스의 객체를 생성
        Outer.Inner inner1 = outer.new Inner();     // 이후 내부 클래스 객체 생성

        Outer.Inner inner2 = new Outer().new Inner();  //한 줄로 내부 클래스 생성하기

        inner1.printHello(" InnerClass" + outer.a);
//        inner2.printHello(" InnerClass" + inner2.a); // 내부 클래스에서 외부 클래스의 필드를 참조할 수 없음
    }

}


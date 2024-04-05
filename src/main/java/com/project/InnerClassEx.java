package com.project;
class Liquid {
    int a = 1;
    String b = "Hello";
    static Integer num = new Integer(9);

    class Inner {
        void printHello(String name) {
            System.out.println(b + name);
        }
    }

    static private class Water {
        String name;
        int stock = 100;

        Water() {
            this("samdasoo");
        }

        Water(String name) {
            this.name = name;
        }
    }

    void speakStock() {
        Water samdasoo = new Water();

        System.out.println("어이 김씨 물이 몇 개 남았는가?");
        System.out.println("아마 " + samdasoo.stock + "정도 있을게야");
    }


}

class PocketBall {
    int size = 100;
    int price = 5000;

    public void pocketMethod() {
        int exp = 5000;

        // 메서드 내에서 클래스를 선언
        class PocketMonster {
            String name = "이상해씨";
            int level = 10;

            public void getPoketLevel() {
                System.out.println(level); // 인스턴스 변수 출력
                System.out.println(exp); // 메서드 지역 상수 출력
            }
        }

        // 메서드 내에서 클래스를 선언
        class PocketMonster2 {
            String name = "리자몽";
            int level = 50;
        }

        new PocketMonster().getPoketLevel();
        System.out.println("메서드 실행 완료");
    }
}

interface Anonymous {
    String amIAnonymous();
}

public class InnerClassEx implements Anonymous{
    public static void main(String[] args) {
        // Object 클래스를 일회성으로 익명 클래스로 선언하여 변수 o에 저장
        Anonymous o = new Anonymous() {
            @Override
            public String amIAnonymous() {
                return "아 제가 익명 클래스입니다.";
            }
        };    // 익명 클래스 뒤에는 반드시 세미콜론을 붙혀줘야 한다.

        // 익명 클래스의 객체의 오버라이딩한 메서드를 사용
        String txt = o.amIAnonymous();
        System.out.println(txt); // 아 제가 익명 클래스입니다.
    }

    @Override
    public String amIAnonymous() {
        return null;
    }
}


/* 패키지 선언 */
package com.project.voyagelog;

/* 패키지 가져오기 */
import java.lang.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Art {
    void display() {
        System.out.println("아트 display 메서드");
    }
}

class Drawing extends Art {
    void display() {
        System.out.println("드로잉 display 메서드");
    }
}

class Cartoon extends Drawing {
}


public class VoyageLogApplication {
    public static void main(String[] args) {
        Art art = new Art();
        art.display();
        Drawing drawing = new Drawing();
        drawing.display();
        Art art_drawing = new Drawing();
        art_drawing.display();
    }
}



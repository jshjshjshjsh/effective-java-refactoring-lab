package org.jsh.chapter10.item69_item77;

public class Mountain {

    // Item 69 위반: 예외를 반복문 종료용으로 사용
    public static void climb(int[] mountains) {
        for ( int height : mountains ) {
            System.out.println("등반 중: 높이 " + height);
        }
    }

    // Item 77 위반: 예외 무시 (Empty Catch Block)
    public static void rest() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
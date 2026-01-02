package org.jsh.chapter10.item69_item77;

public class Mountain {

    // Item 69 위반: 예외를 반복문 종료용으로 사용 (끔찍함)
    public static void climb(int[] mountains) {
        try {
            int i = 0;
            while (true) {
                System.out.println("등반 중: 높이 " + mountains[i++]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // 배열 끝에 도달하면 예외가 발생하고 여기서 루프 종료
        }
    }

    // Item 77 위반: 예외 무시 (Empty Catch Block)
    public static void rest() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // 아무것도 안 함 (예외를 꿀꺽 삼킴 -> 디버깅 지옥의 시작)
        }
    }
}
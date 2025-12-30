package org.jsh.chapter05.item34;

public class Operation {
    // Bad: 정수 열거 패턴 - 타입 안전성 없음, 표현력 부족
    public static final int PLUS = 0;
    public static final int MINUS = 1;
    public static final int TIMES = 2;
    public static final int DIVIDE = 3;

    // 연산을 수행하는 메서드 (상수가 추가되면 여기도 수정해야 함 -> 실수하기 딱 좋음)
    public static double apply(int op, double x, double y) {
        switch (op) {
            case PLUS:   return x + y;
            case MINUS:  return x - y;
            case TIMES:  return x * y;
            case DIVIDE: return x / y;
            default: throw new AssertionError("Unknown op: " + op);
        }
    }
}
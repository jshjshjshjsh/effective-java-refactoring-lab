package org.jsh.chapter05.item34;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    // Good: 각 인스턴스 필드에 람다를 할당
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    // 연산을 수행하는 메서드 (상수가 추가되면 여기도 수정해야 함 -> 실수하기 딱 좋음)
    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
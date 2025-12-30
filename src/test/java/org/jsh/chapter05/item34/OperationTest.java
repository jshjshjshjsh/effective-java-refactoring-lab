package org.jsh.chapter05.item34;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class OperationTest {

    @Test
    @DisplayName("정수 상수 패턴의 계산기 테스트")
    void operationTest() {
        // Given
        double x = 2.0;
        double y = 4.0;

        // When & Then
        assertThat(Operation.PLUS.apply(x, y)).isEqualTo(6.0);
        assertThat(Operation.DIVIDE.apply(x, y)).isEqualTo(0.5);

        // Bad Case: 존재하지 않는 연산(99)을 넣어도 컴파일은 됨 (타입 안전성 X)
        // 실행해야 비로소 에러 발생
        //assertThatThrownBy(() -> Operation.apply(99, x, y))
        //        .isInstanceOf(AssertionError.class);
        assertThat(String.valueOf(Operation.MINUS)).isEqualTo("-");
    }
}
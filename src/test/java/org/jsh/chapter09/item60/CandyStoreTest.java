package org.jsh.chapter09.item60;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

class CandyStoreTest {

    @Test
    @DisplayName("double로 잔돈 계산 시 정밀도 문제 확인")
    void doublePrecisionTest() {
        // Given
        double funds = 1.03;
        double price = 0.42;

        // When
        BigDecimal change = CandyStore.calculateChange(funds, price);

        // Then
        System.out.println("Result: " + change);
        // 출력 예상: 0.61

        // BigDecimal 로 결과 정답
        assertThat(change).isEqualTo(BigDecimal.valueOf(0.61));
    }
}
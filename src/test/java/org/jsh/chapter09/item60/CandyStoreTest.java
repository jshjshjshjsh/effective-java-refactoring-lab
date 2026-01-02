package org.jsh.chapter09.item60;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CandyStoreTest {

    @Test
    @DisplayName("double로 잔돈 계산 시 정밀도 문제 확인")
    void doublePrecisionTest() {
        // Given
        double funds = 1.03;
        double price = 0.42;

        // When
        double change = CandyStore.calculateChange(funds, price);

        // Then
        System.out.println("Result: " + change);
        // 출력 예상: 0.6100000000000001

        // 당연히 0.61이어야 하는데, 컴퓨터는 아니라고 함
        assertThat(change).isNotEqualTo(0.61);
    }
}
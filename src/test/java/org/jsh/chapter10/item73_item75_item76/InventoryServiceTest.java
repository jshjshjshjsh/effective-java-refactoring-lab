package org.jsh.chapter10.item73_item75_item76;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InventoryServiceTest {

    @Test
    @DisplayName("실패 원자성 위반 및 저수준 예외 노출 확인")
    void atomicityTest() {
        // Given
        InventoryService service = new InventoryService();

        // When
        // 예외가 터지는 건 확인 (IndexOutOfBoundsException)
        // 하지만 이건 우리가 원하는 '주문 실패 예외'가 아님.
        assertThatThrownBy(() -> service.ship(999))
                .isInstanceOf(IndexOutOfBoundsException.class);

        // Then (치명적인 문제)
        // 예외가 터졌으면 재고는 그대로 10이어야 하는데, 이미 9로 줄어있음!
        assertThat(service.getStock())
                .describedAs("예외가 발생했으나 재고가 차감되어 실패 원자성이 깨짐")
                .isEqualTo(9);
    }
}
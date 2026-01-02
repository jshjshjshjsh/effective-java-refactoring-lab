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
        assertThatThrownBy(() -> service.ship(999))
                .isInstanceOf(InventoryService.OrderProcessingException.class) // 우리가 만든 고수준 예외
                .hasMessageContaining("ID: 999") // 실패 정보 포함 확인
                .hasCauseInstanceOf(IndexOutOfBoundsException.class); // 근본 원인이 잘 연결됐는지 확인

        // Then (실패 원자성 검증)
        assertThat(service.getStock())
                .describedAs("예외가 발생했으므로 재고는 줄어들지 않아야 한다")
                .isEqualTo(10); // 9가 아니라 10이어야 통과
    }
}
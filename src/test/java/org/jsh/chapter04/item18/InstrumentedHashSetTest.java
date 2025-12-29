package org.jsh.chapter04.item18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.assertj.core.api.Assertions.*;

class InstrumentedHashSetTest {

    @Test
    @DisplayName("상속 사용 시 더블 카운팅 버그 테스트")
    void doubleCountingTest() {
        // Given
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>(new HashSet<String>());

        // When
        // 리스트의 원소 3개를 한 번에 추가
        s.addAll(List.of("틱", "탁", "톡"));

        // Then
        // 예상: 3
        // 실제: 6 (addAll에서 +3, 내부 add 호출되면서 각각 +1씩 3번 더해짐)
        // Before 코드는 여기서 실패해야 함
        assertThat(s.getAddCount()).isEqualTo(3);
    }
}
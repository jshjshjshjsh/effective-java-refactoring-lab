package org.jsh.chapter03.item11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;

class PhoneNumberTest {

    @Test
    @DisplayName("HashMap에서 값을 찾지 못하는 문제 확인")
    void hashMapTest() {
        // Given
        Map<PhoneNumber, String> m = new HashMap<>();
        // 첫 번째 인스턴스 저장
        m.put(new PhoneNumber(707, 867, 5309), "제니");

        // When
        // 논리적으로 동일한 두 번째 인스턴스로 조회
        // hashCode가 재정의되지 않았다면, 서로 다른 버킷을 뒤져서 null이 나옴
        String result = m.get(new PhoneNumber(707, 867, 5309));

        // Then
        // Before: 실패함 (null이 반환됨)
        // After: 성공해야 함 ("제니"가 반환됨)
        assertThat(result).isEqualTo("제니");
    }
}
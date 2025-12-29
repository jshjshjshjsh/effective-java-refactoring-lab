package org.jsh.chapter03.item12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PhoneNumberTest {

    @Test
    @DisplayName("toString 포맷 검증")
    void toStringTest() {
        // Given
        PhoneNumber pn = new PhoneNumber(707, 867, 5309);

        // When
        String result = pn.toString();

        // Then
        // Before: 실패 (해시코드가 출력됨)
        // After: 성공 ("707-867-5309" 포맷)
        assertThat(result).contains("707-867-5309");

        // 로그로도 한번 찍어보세요. 눈으로 차이를 확인하는 게 좋습니다.
        System.out.println("My PhoneNumber: " + pn);
    }
}
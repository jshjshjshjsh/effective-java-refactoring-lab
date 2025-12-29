package org.jsh.chapter03.item10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CaseInsensitiveEmailTest {

    @Test
    @DisplayName("대칭성 위배 확인 테스트")
    void symmetryTest() {
        // Given
        CaseInsensitiveEmail myEmail = new CaseInsensitiveEmail("User@Example.com");
        String normalString = "user@example.com";

        // When & Then
        // 1. 내 클래스 -> String 비교 (Before 코드 때문에 True가 나옴)
        // After 이후 False가 나오는게 정상이다.
        assertThat(myEmail.equals(normalString)).isFalse();

        // 2. String -> 내 클래스 비교 (String은 내 클래스를 모르니까 False가 나옴)
        // 대칭성이 깨졌으므로 여기서 테스트가 실패하거나, 논리적 모순이 발생해야 함.
        // 리팩토링 후에는 둘 다 False가 나와야 정상임.
        assertThat(normalString.equals(myEmail)).isFalse();
    }
}
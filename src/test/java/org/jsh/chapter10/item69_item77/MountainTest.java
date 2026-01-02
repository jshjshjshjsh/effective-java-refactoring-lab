package org.jsh.chapter10.item69_item77;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MountainTest {

    @Test
    @DisplayName("예외를 이용한 루프 종료와 예외 무시 테스트")
    void badPracticeTest() {
        // Given
        int[] mountains = {1000, 2000, 3000};

        // When & Then
        // 에러 없이 돌긴 돌지만, 이렇게 짜면 성능도 구리고 가독성도 좋지않음.
        assertThatCode(() -> Mountain.climb(mountains))
                .doesNotThrowAnyException();

        assertThatCode(() -> Mountain.rest())
                .doesNotThrowAnyException();
    }
}
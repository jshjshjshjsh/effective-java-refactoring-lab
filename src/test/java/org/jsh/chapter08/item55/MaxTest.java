package org.jsh.chapter08.item55;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    @DisplayName("최댓값 구하기 및 빈 컬렉션 예외 확인")
    void maxTest() {
        // Given
        List<Integer> list = List.of(1, 3, 2);

        // When & Then (정상 케이스)
        assertThat(Max.max(list)).contains(3);

        // When & Then (예외 케이스)
        //assertThatThrownBy(() -> Max.max(List.<Integer>of()))
        //        .isInstanceOf(IllegalArgumentException.class)
        //        .hasMessage("빈 컬렉션입니다.");
        assertThat(Max.max(List.<Integer>of())).isEqualTo(Optional.empty());
    }

    @Test
    @DisplayName("최댓값 구하기 및 빈 컬렉션 예외 확인(Stream 적용)")
    void maxStreamTest() {
        // Given
        List<Integer> list = List.of(1, 3, 2);

        // When & Then (정상 케이스)
        assertThat(Max.maxStream(list)).contains(3);

        // When & Then (예외 케이스)
        //assertThatThrownBy(() -> Max.max(List.<Integer>of()))
        //        .isInstanceOf(IllegalArgumentException.class)
        //        .hasMessage("빈 컬렉션입니다.");
        assertThat(Max.maxStream(List.<Integer>of())).isEqualTo(Optional.empty());
    }
}
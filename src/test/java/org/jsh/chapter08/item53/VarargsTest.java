package org.jsh.chapter08.item53;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class VarargsTest {

    @Test
    @DisplayName("가변인수 0개 입력 시 런타임 에러 확인")
    void minTest() {
        // Given & When & Then
        // 1. 정상 동작
        assertThat(Varargs.min(3, 1, 2)).isEqualTo(1);

        // 2. 문제 상황: 인수를 0개 넣어도 컴파일은 됨 (실행해야 에러 발생)
        // After 리팩토링 후에는: min() 호출 자체가 컴파일 에러가 나야 함
        //assertThatThrownBy(() -> Varargs.min())
        //        .isInstanceOf(IllegalArgumentException.class);
    }
}
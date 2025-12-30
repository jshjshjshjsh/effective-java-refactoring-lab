package org.jsh.chapter05.item26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("로 타입 사용 시 런타임 에러 발생 확인")
    void rawTypeTest() {
        // Given
        Account account = new Account();
        account.addHistory("입금: 10000원");

        // 실수로 String이 아니라 Integer를 넣음
        // Raw Type이라서 컴파일 에러가 안 남! (폭탄 설치 완료)
        account.addHistory("20000");

        // When & Then
        // 꺼낼 때 (String)으로 캐스팅하다가 터짐
        // After 리팩토링 후에는: 아예 account.addHistory(10000) 부분에서 컴파일 에러가 나야 함.
        //assertThatThrownBy(() -> account.getHistory(1))
        //        .isInstanceOf(ClassCastException.class);
        assertThat(account.getHistory(1)).isEqualTo("20000");
    }
}
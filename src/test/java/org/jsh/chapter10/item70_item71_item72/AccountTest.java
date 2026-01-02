package org.jsh.chapter10.item70_item71_item72;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.naming.InsufficientResourcesException;
import static org.assertj.core.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("나쁜 예외 설계 테스트")
    void badExceptionTest() {
        Account account = new Account(1000);

        // Checked Exception이라서 람다 안에서 처리하기가 매우 까다로움
        // assertj의 assertThatThrownBy는 그나마 Checked 예외도 잡아주지만,
        // 실제 코드에서 호출할 땐 try-catch를 덕지덕지 발라야 함.

        assertThatThrownBy(() -> account.withdraw(-100))
                .isInstanceOf(Account.MyCustomInvalidMoneyException.class);

        assertThatThrownBy(() -> account.withdraw(2000))
                .isInstanceOf(InsufficientResourcesException.class);
    }
}
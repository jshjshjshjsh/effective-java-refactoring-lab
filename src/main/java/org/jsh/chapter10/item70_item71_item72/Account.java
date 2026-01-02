package org.jsh.chapter10.item70_item71_item72;

import javax.naming.InsufficientResourcesException;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    // Bad:
    // 1. 모든 예외가 Checked Exception이라 호출하는 쪽에서 try-catch 필수 (Item 70, 71 위반)
    // 2. 표준 예외(IllegalArgumentException)가 있는데 굳이 커스텀 예외 생성 (Item 72 위반)
    // 3. 자바 표준 예외가 아닌 엉뚱한 예외(InsufficientResourcesException) 사용 (Item 72 위반)
    public void withdraw(int money) throws MyCustomInvalidMoneyException, InsufficientResourcesException {
        if (money <= 0) {
            // 돈이 음수일 수 없는데 굳이 Checked 예외를 던짐
            throw new MyCustomInvalidMoneyException("출금액은 0보다 커야 합니다.");
        }

        if (balance < money) {
            // 잔고 부족은 객체 상태 문제인데, 이름도 이상한 Checked 예외를 씀
            throw new InsufficientResourcesException("잔고가 부족합니다.");
        }

        balance -= money;
    }

    // 설명을 위해 내부에 정의한 커스텀 체크 예외
    public static class MyCustomInvalidMoneyException extends Exception {
        public MyCustomInvalidMoneyException(String message) { super(message); }
    }
}
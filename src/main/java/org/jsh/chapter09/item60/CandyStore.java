package org.jsh.chapter09.item60;

import java.math.BigDecimal;

public class CandyStore {

    // Good: BigDecimal 을 사용한 금융 계산
    public static BigDecimal calculateChange(double funds, double price) {
        BigDecimal bd_funds = BigDecimal.valueOf(funds);
        BigDecimal bd_price = BigDecimal.valueOf(price);
        return bd_funds.subtract(bd_price);
    }
}
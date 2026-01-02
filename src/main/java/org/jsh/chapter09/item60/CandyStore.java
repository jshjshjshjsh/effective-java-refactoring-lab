package org.jsh.chapter09.item60;

public class CandyStore {

    // Bad: double을 사용한 금융 계산
    public static double calculateChange(double funds, double price) {
        return funds - price;
    }
}
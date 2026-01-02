package org.jsh.chapter10.item73_item75_item76;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private int stock = 10; // 초기 재고 10개
    private final List<String> database = new ArrayList<>(); // 비어있는 DB (저수준 구현체)

    // Bad:
    // 1. 저수준 예외(IndexOutOfBoundsException)가 그대로 노출됨 (Item 73 위반)
    // 2. 예외가 터지면 stock만 줄어든 상태로 남음 (Item 76 - 실패 원자성 위반)
    public void ship(int orderId) {
        // [문제의 지점] 상태를 먼저 변경해버림
        stock--;

        // 여기서 예외 발생! (DB에 없는 인덱스 조회)
        // Item 75 위반: 예외 메시지에 아무 정보도 없음 (그냥 시스템 예외)
        String item = database.get(orderId);

        System.out.println("배송 완료: " + item);
    }

    public int getStock() {
        return stock;
    }
}
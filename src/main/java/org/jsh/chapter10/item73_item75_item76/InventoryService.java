package org.jsh.chapter10.item73_item75_item76;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private int stock = 10; // 초기 재고 10개
    private final List<String> database = new ArrayList<>(); // 비어있는 DB (저수준 구현체)

    // Good: Unchecked 예외라 'throws' 선언 필요 없음
    public void ship(int orderId) {
        try {
            // 1. 위험한 작업 먼저 시도 (여기서 터지면 catch로 점프)
            String item = database.get(orderId);

            // 2. 위험 구간 통과 후 상태 변경 (Item 76: 실패 원자성 확보)
            stock--;

            System.out.println("배송 완료: " + item);

        } catch (IndexOutOfBoundsException e) {
            // Item 73 & 75: 예외 번역 + 상세 메시지 + 원인(cause) 전달
            throw new OrderProcessingException("주문 처리 실패 - ID: " + orderId, e);
        }
    }

    public int getStock() {
        return stock;
    }

    // Good: RuntimeException 상속 (Unchecked)
    public static class OrderProcessingException extends RuntimeException {
        // 중요: Throwable 타입으로 받아서 super에 넘겨야 원인 추적 가능
        public OrderProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
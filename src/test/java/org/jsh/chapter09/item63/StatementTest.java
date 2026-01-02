package org.jsh.chapter09.item63;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class StatementTest {

    @Test
    @DisplayName("String(+) vs StringBuilder 성능 비교 (1만개 연결)")
    void performanceComparison() {
        // Given: 데이터 10,000개 준비
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            items.add("Item" + i);
        }

        // 1. [Bad] String (+) 방식 측정
        long start1 = System.currentTimeMillis();
        String result1 = Statement.makeLineByJustAdd(items);
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1;

        // 결과 리포트 출력
        System.out.println("=========================================");
        System.out.println("데이터 개수: " + items.size() + "개");
        System.out.println("1. String (+) 방식 소요 시간: " + time1 + "ms");
        System.out.println("=========================================");

    }
}
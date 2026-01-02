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

        // 2. [Good] StringBuilder 방식 측정
        long start2 = System.currentTimeMillis();
        String result2 = Statement.makeLineByStringBuilder(items);
        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2;

        // 결과 리포트 출력
        System.out.println("=========================================");
        System.out.println("데이터 개수: " + items.size() + "개");
        System.out.println("1. String (+) 방식 소요 시간: " + time1 + "ms");
        System.out.println("2. StringBuilder 방식 소요 시간: " + time2 + "ms");
        System.out.println("=========================================");

        // Then:
        // 1. 결과값은 같아야 한다.
        assertThat(result2).isEqualTo(result1);

        // 2. StringBuilder가 무조건 더 빨라야 한다.
        assertThat(time2).isLessThan(time1);
    }
}
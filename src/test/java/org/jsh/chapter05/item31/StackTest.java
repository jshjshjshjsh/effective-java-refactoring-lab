package org.jsh.chapter05.item31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class StackTest {

    @Test
    @DisplayName("PECS 공식 적용 전 컴파일 에러 확인")
    void pecsTest() {
        Stack<Number> numberStack = new Stack<>();
        List<Integer> integers = List.of(1, 2, 3);

        // [문제 1] pushAll
        // 논리적으론 Integer가 Number니까 들어가야 하는데,
        // Iterable<Integer>와 Iterable<Number>는 남남이라서 컴파일 에러!
        numberStack.pushAll(integers);

        // [문제 2] popAll
        // Number를 Object 리스트에 옮겨 담으려 함. 논리적으로 가능.
        // 하지만 Collection<Object>와 Collection<Number>는 남남이라서 컴파일 에러!
        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);

        // 결과 확인
        assertThat(objects).hasSize(3);
    }
}
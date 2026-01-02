package org.jsh.chapter09.item63;

import java.util.List;

public class Statement {

    // Bad: 반복문 내에서 문자열 연결 (+) 연산자 사용 -> 성능 최악 (O(n^2))
    public static String makeLineByJustAdd(List<String> items) {
        String result = "";
        for (String item : items) {
            result += item; // 여기가 병목 지점! 매번 새 String 객체를 생성하고 복사함
        }
        return result;
    }
}
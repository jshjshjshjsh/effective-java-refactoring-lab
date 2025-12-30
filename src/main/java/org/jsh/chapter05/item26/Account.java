package org.jsh.chapter05.item26;

import java.util.ArrayList;
import java.util.List;

public class Account {
    // Good: Raw Type 제거하여 타입 제한
    private final List<String> history = new ArrayList<String>();

    // String만 받음
    public void addHistory(String record) {
        history.add(record);
    }

    // 꺼낼 때 String으로 형변환 (여기서 터짐)
    public String getHistory(int index) {
        return history.get(index);
    }
}
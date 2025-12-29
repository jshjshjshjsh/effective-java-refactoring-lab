package org.jsh.chapter05.item26;

import java.util.ArrayList;
import java.util.List;

public class Account {
    // Bad: Raw Type 사용 (무엇이든 들어갈 수 있음)
    private final List history = new ArrayList();

    // 아무거나 다 받음
    public void addHistory(Object record) {
        history.add(record);
    }

    // 꺼낼 때 String으로 형변환 (여기서 터짐)
    public String getHistory(int index) {
        return (String) history.get(index);
    }
}
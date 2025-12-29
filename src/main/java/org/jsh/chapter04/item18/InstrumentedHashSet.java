package org.jsh.chapter04.item18;

import java.util.Collection;
import java.util.HashSet;

// 상속을 잘못 사용한 예
public class InstrumentedHashSet<E> extends HashSet<E> {
    // 추가된 원소의 수
    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        // 여기서 문제 발생!
        // HashSet의 addAll은 내부적으로 add를 호출함 -> addCount가 또 올라감 (Double Counting)
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
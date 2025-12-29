package org.jsh.chapter04.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 상속을 잘못 사용한 예
public class InstrumentedHashSet<E> {
    // 추가된 원소의 수
    private int addCount = 0;
    private final Set<E> set;

    public InstrumentedHashSet(Set<E> set) {
        this.set = set;
    }

    public boolean add(E e) {
        addCount++;
        return set.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        // 상속과 달리 set.addAll()이 내부적으로 set.add()를 호출하더라도
        // 그것은 저쪽 set 객체의 add이지, InstrumentedSet의 add가 아님
        // 따라서 addCount가 중복으로 증가하지 않음
        return set.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
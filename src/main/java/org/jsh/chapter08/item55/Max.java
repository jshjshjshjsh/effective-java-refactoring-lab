package org.jsh.chapter08.item55;

import java.util.Collection;
import java.util.Objects;

public class Max {
    // Before: 빈 컬렉션이면 예외를 던짐 (과격한 처리)
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("빈 컬렉션입니다.");

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return result;
    }
}
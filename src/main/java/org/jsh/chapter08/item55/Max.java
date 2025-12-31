package org.jsh.chapter08.item55;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class Max {
    // Before: 빈 컬렉션이면 예외를 던짐 (과격한 처리)
    // After : 빈 컬렉션일 경우 빈 Optional을, 있는 경우 Optional로 감싸서 반환
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }
        return Optional.of(result);
    }
}
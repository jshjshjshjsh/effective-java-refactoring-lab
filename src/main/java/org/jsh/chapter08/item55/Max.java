package org.jsh.chapter08.item55;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class Max {

    /**
     * 컬렉션에서 최댓값을 반환합니다.
     * <p>
     * 이 메서드는 {@link Comparable} 인터페이스를 구현한 요소들로 구성된 컬렉션을 받아,
     * 그중 가장 큰 요소를 {@link Optional}로 감싸서 반환합니다.
     * </p>
     *
     * @param c   최댓값을 찾을 컬렉션 (null이 아니어야 함)
     * @param <E> 컬렉션 요소의 타입 (Comparable을 구현해야 함)
     * @return 컬렉션이 비어있으면 {@link Optional#empty()},
     * 그렇지 않으면 최댓값을 담은 {@code Optional<E>}
     * @throws NullPointerException 지정된 컬렉션이 null인 경우
     *
     * @implSpec
     * 이 구현은 컬렉션을 순회하며 최댓값을 찾습니다. 시간 복잡도는 O(n)입니다.
     */
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

    /**
     * 컬렉션에서 최댓값을 반환합니다 (스트림 버전).
     * * @param c   최댓값을 찾을 컬렉션
     * @param <E> 컬렉션 요소의 타입
     * @return 최댓값을 담은 Optional, 빈 컬렉션이면 빈 Optional
     * @see #max(Collection)
     */
    public static <E extends Comparable<E>> Optional<E> maxStream(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }
}
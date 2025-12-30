package org.jsh.chapter05.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.EmptyStackException;

public class Stack<E> {
    private final List<E> elements = new ArrayList<>();

    public void push(E e) {
        elements.add(e);
    }

    public E pop() {
        if (elements.isEmpty()) throw new EmptyStackException();
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // 문제의 구간 1: src의 타입이 정확히 Iterable<E>여야만 함
    public void pushAll(Iterable<E> src) {
        for (E e : src)
            push(e);
    }

    // 문제의 구간 2: dst의 타입이 정확히 Collection<E>여야만 함
    public void popAll(Collection<E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }
}
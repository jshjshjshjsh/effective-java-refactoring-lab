package org.jsh.chapter08.item53;

public class Varargs {

    // Bad: 0개의 인수가 들어오면 런타임에 실패함
    public static int min(int... args) {
        if (args.length == 0)
            throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");

        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min)
                min = args[i];
        }
        return min;
    }
}
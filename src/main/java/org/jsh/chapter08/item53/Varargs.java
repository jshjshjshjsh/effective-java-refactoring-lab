package org.jsh.chapter08.item53;

public class Varargs {

    // 첫 번째 인자를 입력하게 강제하여, 잘못된 값을 넣을 시 컴파일 에러를 유도
    public static int min(int min, int... args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min)
                min = args[i];
        }
        return min;
    }
}
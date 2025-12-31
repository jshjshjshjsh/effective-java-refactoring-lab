package org.jsh.chapter07.item45;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

    // 과도한 스트림 사용에서 가독성 좋게 메소드로 분리
    public static List<String> solve(List<String> words, int minGroupSize) {
        return words.stream()
                .collect(groupingBy(Anagrams::alphabetize)) // 으악! 여기서 무슨 일이 일어나는 거야?
                .values().stream()
                .filter(group -> group.size() >= minGroupSize)
                .map(group -> group.size() + ": " + group)
                .collect(Collectors.toList());
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
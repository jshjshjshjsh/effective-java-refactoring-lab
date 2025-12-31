package org.jsh.chapter07.item45;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

    // 나쁜 예: 스트림을 과하게 사용하여 가독성을 해침
    public static List<String> solve(List<String> words, int minGroupSize) {
        return words.stream()
                .collect(groupingBy(word -> word.chars().sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString())) // 으악! 여기서 무슨 일이 일어나는 거야?
                .values().stream()
                .filter(group -> group.size() >= minGroupSize)
                .map(group -> group.size() + ": " + group)
                .collect(Collectors.toList());
    }
}
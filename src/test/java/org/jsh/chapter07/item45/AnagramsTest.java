package org.jsh.chapter07.item45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class AnagramsTest {

    @Test
    @DisplayName("아나그램 그룹핑 테스트")
    void anagramTest() {
        // Given
        List<String> dictionary = List.of(
                "staple", "petals", // group 1
                "hat", "act", // no group
                "listen", "silent"  // group 2
        );

        // When
        // 최소 2개 이상 묶인 그룹만 찾기
        List<String> result = Anagrams.solve(dictionary, 2);

        // Then
        assertThat(result).hasSize(2);
        assertThat(result.toString()).contains("staple", "petals", "listen", "silent");

        System.out.println(result);
        // 출력 예: [2: [staple, petals], 2: [listen, silent]]
    }
}
package org.jsh.chapter02.item02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NutritionFactsTest {

    @Test
    @DisplayName("점층적 생성자 패턴 사용 - 코카콜라")
    void createCocaCola() {
        // Given & When

        // 리팩토링 코드
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .fat(0)
                .sodium(35)
                .carbohydrate(27)
                .build();

        // Then
        assertThat(cocaCola.getServingSize()).isEqualTo(240);
        assertThat(cocaCola.getServings()).isEqualTo(8);
        assertThat(cocaCola.getCalories()).isEqualTo(100);
        assertThat(cocaCola.getSodium()).isEqualTo(35);
        assertThat(cocaCola.getCarbohydrate()).isEqualTo(27);
    }
}
package org.jsh.chapter02.item02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NutritionFactsTest {

    @Test
    @DisplayName("점층적 생성자 패턴 사용 - 코카콜라")
    void createCocaCola() {
        // Given & When
        // 매개변수 순서 헷갈림: servingSize, servings, calories, fat, sodium, carbohydrate
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);

        // Then
        assertThat(cocaCola.getServingSize()).isEqualTo(240);
        assertThat(cocaCola.getServings()).isEqualTo(8);
        assertThat(cocaCola.getCalories()).isEqualTo(100);
        assertThat(cocaCola.getSodium()).isEqualTo(35);
        assertThat(cocaCola.getCarbohydrate()).isEqualTo(27);
    }
}
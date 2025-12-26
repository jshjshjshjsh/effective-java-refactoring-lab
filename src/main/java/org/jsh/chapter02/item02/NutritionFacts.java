package org.jsh.chapter02.item02;

public class NutritionFacts {
    private final int servingSize;  // (mL, 1회 제공량)     필수
    private final int servings;     // (회, 총 n회 제공량)  필수
    private final int calories;     // (kCal)              선택
    private final int fat;          // (g)                 선택
    private final int sodium;       // (mg)                선택
    private final int carbohydrate; // (g)                 선택

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder{
        private final int servingSize;  // (mL, 1회 제공량)     필수
        private final int servings;     // (회, 총 n회 제공량)   필수

        private int calories        = 0; // (kCal)              선택
        private int fat             = 0; // (g)                 선택
        private int sodium          = 0; // (mg)                선택
        private int carbohydrate    = 0; // (g)                 선택

        public Builder(final int servingSize, final int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            // (AI) 유효성 검사 추가
            // 예: 칼로리가 음수일 수 없음
            if (calories < 0) {
                throw new IllegalStateException("Calories cannot be negative");
            }
            return new NutritionFacts(this);
        }
    }

    // Getters included for testing
    public int getServingSize() { return servingSize; }
    public int getServings() { return servings; }
    public int getCalories() { return calories; }
    public int getFat() { return fat; }
    public int getSodium() { return sodium; }
    public int getCarbohydrate() { return carbohydrate; }
}
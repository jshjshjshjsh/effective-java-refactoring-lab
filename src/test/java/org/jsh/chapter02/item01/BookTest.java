package org.jsh.chapter02.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("일반 책 생성 검증")
    void createOriginalBook() {
        // Given & When
        // TODO: Refactoring 시 정적 팩터 메서드로 변경 필요
        Book book = new Book("Effective Java", "Joshua Bloch", 2018);

        // Then
        assertThat(book.getTitle()).isEqualTo("Effective Java");
        assertThat(book.getAuthor()).isEqualTo("Joshua Bloch");
        assertThat(book.isTranslation()).isFalse();
    }

    @Test
    @DisplayName("번역본 책 생성 검증")
    void createTranslatedBook() {
        // Given & When
        // TODO: Refactoring 시 정적 팩터 메서드로 변경 필요
        Book book = new Book("이펙티브 자바", "Joshua Bloch", 2018, true);

        // Then
        assertThat(book.getTitle()).isEqualTo("이펙티브 자바");
        assertThat(book.isTranslation()).isTrue();
    }
}
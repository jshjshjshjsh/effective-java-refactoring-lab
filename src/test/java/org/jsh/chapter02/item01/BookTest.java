package org.jsh.chapter02.item01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("일반 책 생성 검증")
    void createOriginalBook() {
        // Given & When
        Book book = Book.newInstance("Effective Java", "Joshua Bloch", false, 2018);

        // Then
        assertThat(book.getTitle()).isEqualTo("Effective Java");
        assertThat(book.getAuthor()).isEqualTo("Joshua Bloch");
        assertThat(book.isTranslation()).isFalse();
    }

    @Test
    @DisplayName("번역본 책 생성 검증")
    void createTranslatedBook() {
        // Given & When
        Book book = Book.newInstance("이펙티브 자바", "Joshua Bloch", true , 2018);

        // Then
        assertThat(book.getTitle()).isEqualTo("이펙티브 자바");
        assertThat(book.isTranslation()).isTrue();
    }
}
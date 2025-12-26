package org.jsh.chapter02.item09;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FileCopierTest {

    @TempDir
    Path tempDir;

    @Test
    @DisplayName("파일 복사 테스트")
    void copyFile() throws IOException {
        // Given
        File sourceFile = tempDir.resolve("source.txt").toFile();
        File destFile = tempDir.resolve("dest.txt").toFile();

        // 소스 파일에 내용 쓰기
        Files.write(sourceFile.toPath(), List.of("Hello", "World"));

        FileCopier copier = new FileCopier();

        // When
        copier.copy(sourceFile.getAbsolutePath(), destFile.getAbsolutePath());

        // Then
        assertThat(destFile).exists();
        assertThat(Files.readAllLines(destFile.toPath()))
                .containsExactly("Hello", "World");
    }
}
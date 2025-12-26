package org.jsh.chapter02.item01;

public class Book {
    private String title;
    private String author;
    private boolean isTranslation;
    private int year;

    // 1. 기본 책 생성
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isTranslation = false;
    }

    // 2. 번역본 생성 (파라미터 타입과 순서가 위와 비슷해서 헷갈림)
    public Book(String title, String author, int year, boolean isTranslation) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isTranslation = isTranslation;
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isTranslation() { return isTranslation; }
    public int getYear() { return year; }
}
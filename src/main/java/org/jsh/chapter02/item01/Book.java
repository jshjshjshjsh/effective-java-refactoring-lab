package org.jsh.chapter02.item01;

public class Book {
    private String title;
    private String author;
    private boolean isTranslation;
    private int year;

    private Book(){}
    private Book(String title, String author, boolean isTranslation, int year){
        this.title = title;
        this.author = author;
        this.isTranslation = isTranslation;
        this.year = year;
    }

    // 리펙토링 코드
    public static Book newInstance(String title, String author, boolean isTranslation, int year){
        return new Book(title, author, isTranslation, year);
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isTranslation() { return isTranslation; }
    public int getYear() { return year; }
}
package org.example.librarymanagementsystem;

import lombok.Getter;

@Getter
public class Book {

    private final Long isbn;
    private final String title;
    private final String author;
    private final String available;
    private final Category category;

    private Book(Long isbn, String title, String author, String available, Category category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
        this.category = category;
    }
    // 정적 팩토리 메서드
    public static Book newInstance(
            Long isbn, String title, String author, String available, Category category
    ) {
        return new Book(isbn, title, author, available, category);
    }
}

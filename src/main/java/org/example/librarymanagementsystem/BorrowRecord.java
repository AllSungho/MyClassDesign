package org.example.librarymanagementsystem;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BorrowRecord {

    private final Book book;
    private final Member member;
    private final LocalDate borrowDate;
    private LocalDate dueDate;

    public BorrowRecord(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.dueDate = null;
    }
}

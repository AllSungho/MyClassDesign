package org.example.librarymanagementsystem;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BorrowRecord {

    private final Book book;
    private final Member member;
    private final LocalDate borrowDate;
    private LocalDate dueDate;

    private BorrowRecord(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.dueDate = null;
    }
    // 정적 팩토리 메서드
    public static BorrowRecord newInstance(Book book, Member member) {
        return new BorrowRecord(book, member);
    }

    public void returnRecord() {
        this.dueDate = LocalDate.now();
    }
}

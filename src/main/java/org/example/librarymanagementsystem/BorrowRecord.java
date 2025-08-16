package org.example.librarymanagementsystem;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BorrowRecord {

    private final Book book;
    private final Member member;
    private final Librarian borrowLibrarian;
    private final LocalDate borrowDate;
    private Librarian returnLibrarian;
    private LocalDate dueDate;

    private BorrowRecord(Book book, Member member, Librarian borrowLibrarian) {
        this.book = book;
        this.member = member;
        this.borrowLibrarian = borrowLibrarian;
        this.borrowDate = LocalDate.now();
        this.returnLibrarian = null;
        this.dueDate = null;
    }
    // 정적 팩토리 메서드
    public static BorrowRecord newInstance(Book book, Member member, Librarian borrowLibrarian) {
        return new BorrowRecord(book, member, borrowLibrarian);
    }

    public void returnRecord(Librarian returnLibrarian) {
        this.dueDate = LocalDate.now();
        this.returnLibrarian = returnLibrarian;
    }
}

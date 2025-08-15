package org.example.librarymanagementsystem;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BorrowRecord {

    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate dueDate;
}

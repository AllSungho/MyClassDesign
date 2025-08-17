package org.example.librarymanagementsystem;

import lombok.Getter;

@Getter
public class BookRegister {

    private final Long bookRegisterId;
    private final Librarian librarian;

    private BookRegister(Long bookRegisterId,  Librarian librarian) {
        this.bookRegisterId = bookRegisterId;
        this.librarian = librarian;
    }
    public static BookRegister newInstance(Long bookRegisterId, Librarian librarian) {
        return  new BookRegister(bookRegisterId, librarian);
    }
    public void register() {

    }
}

package org.example.librarymanagementsystem;

// 사서
public class Librarian {

    private final Long LibrarianId;
    private String name;
    private String phone;

    private Librarian(Long librarianId, String name, String phone) {
        this.LibrarianId = librarianId;
        this.name = name;
        this.phone = phone;
    }
    public static Librarian getInstance(Long librarianId, String name, String phone) {
        return new Librarian(librarianId, name, phone);
    }
    public void changeName(String name) {
        this.name = name;
    }
    public void changePhone(String phone) {
        this.phone = phone;
    }
}

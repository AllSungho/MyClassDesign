package org.example.librarymanagementsystem;

public enum Available {

    BORROWED("B", "빌려감"),
    RETURNED("R", "반납됨"),
    STORAGE("S", "보관 중");

    private final String code;
    private final String description;

    Available(String code, String description) {
        this.code = code;
        this.description = description;
    }
}

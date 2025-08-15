package org.example.librarymanagementsystem;

public enum Grade {

    GOLD("G", "골드"),
    PLATINUM("P", "플레티넘"),
    DIAMOND("D", "다이아몬드");

    private final String code;
    private final String description;

    Grade(String code, String description) {
        this.code = code;
        this.description = description;
    }
}

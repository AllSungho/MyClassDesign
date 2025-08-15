package org.example.librarymanagementsystem;

import lombok.Getter;

@Getter
public enum Category {

    ROMANS("R", "로멘스"),
    ACTION("A", "액션");

    private final String code;
    private final String description;

    Category(String code, String description) {
        this.code = code;
        this.description = description;
    }
}

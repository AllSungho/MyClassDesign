package org.example.librarymanagementsystem;

import lombok.Getter;

@Getter
public class Member {

    private final Long memberId;
    private final String name;
    private final Grade grade;

    public Member(Long memberId, String name, Grade grade) {
        this.memberId = memberId;
        this.name = name;
        this.grade = grade;
    }
}

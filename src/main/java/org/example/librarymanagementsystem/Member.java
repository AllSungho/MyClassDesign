package org.example.librarymanagementsystem;

import lombok.Getter;

@Getter
public class Member {

    private final Long memberId;
    private final String name;
    private final Grade grade;

    private Member(Long memberId, String name, Grade grade) {
        this.memberId = memberId;
        this.name = name;
        this.grade = grade;
    }
    // 정적 팩토리 메서드
    public static Member newInstance(Long memberId, String name, Grade grade) {
        return new Member(memberId, name, grade);
    }

}

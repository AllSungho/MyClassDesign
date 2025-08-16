package org.example.librarymanagementsystem;

import lombok.Getter;

@Getter
public class Member {

    private final Long memberId;
    private String name;
    private String phone;
    private Grade grade;

    private Member(Long memberId, String name, String phone, Grade grade) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.grade = grade;
    }
    // 정적 팩토리 메서드
    public static Member newInstance(Long memberId, String name, String phone, Grade grade) {
        return new Member(memberId, name, phone, grade);
    }
    public void changeName(String name) {
        this.name = name;
    }
    public void changePhone(String phone) {
        this.phone = phone;
    }
    public void changeGrade(Grade grade) {
        this.grade = grade;
    }
}

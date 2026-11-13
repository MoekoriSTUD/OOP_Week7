package org.main;
import java.util.ArrayList;

public class Member {
    private final String memberId;
    private final String name;
    private final int age;

    public Member(String memberId, String name, int age) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }

    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println("\n");
    }
}

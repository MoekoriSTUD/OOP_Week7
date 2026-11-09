package org.main;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member must not be null");
        }

        members.add(member);
    }

    public boolean removeMember(String id) {
        Member member = findMemberById(id);
        if (member == null) {
            return false;
        }
        members.remove(member);
        return true;
    }

    public Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getMemberId().equalsIgnoreCase(id)) {
                return member;
            }
        }
        return null;
    }

    public void displayAllDetails() {
        for (Member m : members) {
            System.out.println("Member ID: " + m.getMemberId());
            System.out.println("Name: " + m.getName());
            System.out.println("Age: " + m.getAge());
            for (int i = 0; i < 10; i++) {
                System.out.print("-");
            }
            System.out.println("\n");
        }
    }
}

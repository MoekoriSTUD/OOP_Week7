package org.main;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayAllDetails(Member member) {
        for (Member list : members) {
            System.out.println(list);
            System.out.println("\n");
        }
    }
}

package org.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean in = true;
        int option = 0;
        String memberID, name;
        int age;

        List<Member> member = new ArrayList<>();
        LibraryService ls = new LibraryService();

        Scanner scan = new Scanner(System.in);

        while (in) {
            System.out.println("---Gym Membership Manager---");
            System.out.println("1. Add member");
            System.out.println("2. Display All Members");
            System.out.println("3. Search by ID");
            System.out.println("4. Remove Member");
            System.out.println("5. Exit");
            System.out.println("Enter Choice: ");
            try {
                option = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please Enter a valid option (1-5)");
            }

            switch (option) {
                case 1:
                    System.out.println("Enter member ID: ");
                    memberID = scan.nextLine();
                    System.out.println("Enter name: ");
                    name = scan.nextLine();
                    System.out.println("Enter age: ");
                    age = Integer.parseInt(scan.nextLine());
                    ls.addMember(new Member(memberID, name, age));
                    System.out.println("Member added successfully\n");
                    break;
                case 2:
                    ls.displayAllDetails();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    in = false;
                    break;

            }
        }
    }
}
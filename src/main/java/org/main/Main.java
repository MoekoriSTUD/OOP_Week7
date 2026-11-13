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

        LibraryService ls = new LibraryService();

        Scanner scan = new Scanner(System.in);

        while (in) {
            System.out.println("---Gym Membership Manager---");
            System.out.println("1. Add member");
            System.out.println("2. Display All Members");
            System.out.println("3. Search by ID");
            System.out.println("4. Remove Member");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            try {
                option = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please Enter a valid option (1-5)");
            }

            switch (option) {
                case 1:
                    System.out.print("\nEnter member ID: ");
                    memberID = scan.nextLine();
                    System.out.print("Enter name: ");
                    name = scan.nextLine();
                    while (true) {
                        System.out.print("Enter age: ");
                        age = Integer.parseInt(scan.nextLine());

                        if (age <= 0 || age > 120) {
                            System.out.println("\nPlease enter a valid age (More than 0 and less than 120)");
                        } else {
                            break;
                        }
                    }
                    Member member = new Member(memberID, name, age);
                    ls.addMember(member);
                    System.out.println("Member added successfully\n");
                    break;
                case 2:
                    try {
                        ls.displayAllDetails();
                    } catch (Exception e) {
                        System.out.println("There's nothing to display!");
                    }
                    break;
                case 3:
                    System.out.print("Enter member ID to search: ");
                    String tempId_srch = scan.nextLine();
                    if (ls.findMemberById(tempId_srch) != null) {
                        System.out.println("Member ID: " + tempId_srch);
                        ls.showMember(tempId_srch);
                    } else {
                        System.out.println("Member with ID: " + tempId_srch + " not found!\n");
                    }
                    break;
                case 4:
                    System.out.print("\nEnter member ID to remove member: ");
                    String tempId_rm = scan.nextLine();
                    if (ls.removeMember(tempId_rm)) {
                        System.out.println("Member with ID: " + tempId_rm + " removed successfully!\n");
                    } else {
                        System.out.println("Member with ID: " + tempId_rm + " not found!");
                    }
                    break;
                case 5:
                    in = false;
                    break;

            }
        }
    }
}
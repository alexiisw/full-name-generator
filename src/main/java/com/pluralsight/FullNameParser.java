package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner nameParser = new Scanner(System.in);

        String fullName;
        String firstName;
        String middleName;
        char middleInitial;
        String lastName;

        System.out.print("Please print your full name here: ");
        fullName = nameParser.nextLine();
//        fullName = fullName.trim();

        String[] separateName = fullName.trim().split(" ");
            if (separateName.length == 3) {
                firstName = separateName[0];
                firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

                middleName = separateName[1];
                middleInitial = Character.toUpperCase(middleName.charAt(0));

                lastName = separateName[2];
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
                System.out.printf("I have your name as%n%s%n%s.%n%s", firstName, middleInitial, lastName);
                // no spaces between the variables so it won't have a weird space once printed; %n = next line

            } else if (separateName.length == 2) {
                firstName = separateName[0];
                firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

                lastName = separateName[1];
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
                System.out.printf("I have your name as%n%s%n%s", firstName, lastName);

            } else {
                System.out.println("Error! Please enter a valid name.");
            }

    }
}


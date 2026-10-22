package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner fullName = new Scanner(System.in);
        String firstName;
        String middleName;
        char middleInitial = '\0';
        String lastName;
        String suffix;

        System.out.println("Hello, Please enter your name below"); // greeting message

        System.out.print("First Name: ");
        firstName = fullName.nextLine();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1); // this makes the first letter capital
        // first part pulls the first letter and changes it to uppercase ; the second part pulls the rest of the letters and combines it

        System.out.print("Middle Name (press 'Enter' if not applicable): ");
        middleName = fullName.nextLine();
        if (!middleName.isEmpty()) { // if middle name is not empty, it will store a char (letter) to display
            middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1); // this makes the first letter capital
            // first part pulls the first letter and changes it to uppercase ; the second part pulls the rest of the letters and combines it
            middleInitial = Character.toUpperCase(middleName.charAt(0)); // makes the letter capital no matter the input
        }

        System.out.print("Last Name: ");
        lastName = fullName.nextLine();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1); // this makes the first letter capital
        // first part pulls the first letter and changes it to uppercase ; the second part pulls the rest of the letters and combines it


        System.out.print("Suffix (press 'Enter' if not applicable): ");
        suffix = fullName.nextLine();

        if (!middleName.isEmpty() && suffix.isEmpty()) {// if middle name is not empty but suffix is empty
            System.out.printf("I have your full name as: %s %c. %s%n", firstName, middleInitial, lastName);
            System.out.printf("I have your full name as: %s %s %s", firstName, middleName, lastName);
        } else if (middleName.isEmpty() && !suffix.isEmpty()) {
            System.out.printf("I have your full name as: %s %s %s, %s", firstName, middleName, lastName, suffix);
        } else if (middleName.isEmpty() && suffix.isEmpty()) {
            System.out.printf("I have your full name as: %s %s", firstName, lastName);
        } else {
            System.out.printf("I have your full name as: %s %c. %s, %s%n", firstName, middleInitial, lastName, suffix);
            System.out.printf("I have your full name as: %s %s %s, %s", firstName, middleName, lastName, suffix);
        }
    }
}

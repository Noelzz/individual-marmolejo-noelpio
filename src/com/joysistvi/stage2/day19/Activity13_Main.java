package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class Activity13_Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("*        User Account Registration         *");
        System.out.println("********************************************");
        System.out.println();

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Address: ");
        String address = input.nextLine();

        Activity13_Marmolejo user = new Activity13_Marmolejo(
                firstName,
                middleName,
                lastName,
                address,
                "temporary@gmail.com",
                "temporary123"
        );

        while (true) {

            System.out.print("Enter Email: ");
            String email = input.nextLine();

            try {
                user.setEmail(email);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid email.");
                System.out.println();
            }
        }

        while (true) {

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            try {
                user.setPassword(password);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter your password again.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("--- User Account Created ---");

        System.out.println(
                "Full Name: "
                        + user.getFirstName() + " "
                        + user.getMiddleName() + " "
                        + user.getLastName()
        );

        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        input.close();
    }
}

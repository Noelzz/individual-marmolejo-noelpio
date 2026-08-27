package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_Marmolejo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        int maxAttempts = 3;
        boolean isLoggedIn = false;

        System.out.println("=================================");
        System.out.println("        SECURE LOGIN SYSTEM");
        System.out.println("=================================");
        System.out.println("You have 3 attempts to login.");
        System.out.println();

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.println("---------------------------------");
            System.out.println("Attempt " + attempt + " of " + maxAttempts);
            System.out.println("---------------------------------");

            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.isEmpty()) {
                System.out.println("Email cannot be empty.");
            } else if (!loginEmail.equals(email)) {
                System.out.println("Invalid email.");
            }

            if (loginPass.isEmpty()) {
                System.out.println("Password cannot be empty.");
            } else if (!loginPass.equals(password)) {
                System.out.println("Invalid password.");
            }

            if (loginEmail.equals(email) && loginPass.equals(password)) {

                System.out.println();
                System.out.println("=================================");
                System.out.println("        LOGIN SUCCESSFUL");
                System.out.println("=================================");
                System.out.println("Welcome back, Winter.");

                isLoggedIn = true;
                break;
            }

            int remainingAttempts = maxAttempts - attempt;

            if (remainingAttempts > 0) {

                System.out.println();
                System.out.println("Remaining attempts: " + remainingAttempts);
                System.out.println("Please try again.");
                System.out.println();

            } else {

                System.out.println();
                System.out.println("=================================");
                System.out.println("          ACCOUNT LOCKED");
                System.out.println("=================================");
                System.out.println("No more attempts remaining.");
                System.out.println("Please try again later.");
            }
        }

        scanner.close();
    }
}
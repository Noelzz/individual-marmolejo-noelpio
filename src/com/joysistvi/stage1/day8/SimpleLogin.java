package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        boolean isLoggedIn = false;

        while (!isLoggedIn) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                isLoggedIn = true;
            } else {
                System.out.println("Invalid username or password. Try again.");
            }
        }

        scanner.close();

       */

        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;

        do {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");

                isLoggedIn = true; // stop the do-while loop
            } else {
                System.out.println("Invalid Username or Password!");
            }

        } while (!isLoggedIn);

        scanner.close();
    }
}


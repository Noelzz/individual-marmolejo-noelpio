package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class Activity5_Marmolejo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 5000.00;
        int choice;

        while (true) {

            System.out.println("\n=== SIMPLE ATM MENU ===");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");

            System.out.print("Enter choice (1-4): ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // Check Balance
                    System.out.println("Your current balance is: " + balance);
                    break;

                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid deposit amount.");
                        System.out.println("Deposit amount must be greater than 0.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposit successful.");
                        System.out.println("New balance: " + balance);
                    }
                    break;

                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();

                    // Validation 1: Amount must be greater than 0
                    if (withdrawAmount <= 0) {

                        System.out.println("Invalid withdrawal amount.");
                        System.out.println("Withdrawal amount must be greater than 0.");

                    } else {

                        // Validation 2: Amount must not exceed balance
                        if (withdrawAmount > balance) {

                            System.out.println("Insufficient balance.");
                            System.out.println("Your current balance is: " + balance);
                            System.out.println("You cannot withdraw more than your current balance.");

                        } else {

                            balance -= withdrawAmount;

                            System.out.println("Withdrawal successful.");
                            System.out.println("New balance: " + balance);
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using Simple ATM. Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
                    System.out.println("Please select only 1, 2, 3, or 4.");
            }
        }
    }
}
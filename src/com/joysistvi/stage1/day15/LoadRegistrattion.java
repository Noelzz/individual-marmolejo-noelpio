package com.joysistvi.stage1.day15;

import java.util.Scanner;

public class LoadRegistrattion {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 100.00;

        // =========================
        // START
        // =========================

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("       LOAD REGISTRATION");
            System.out.println("================================");

            System.out.print("Enter USSD Code: ");
            String ussdCode = scanner.nextLine();

            // Check if the USSD code is correct
            if (ussdCode.equals("*123#")) {

                break;

            } else {

                System.out.println();
                System.out.println("Invalid USSD Code.");
                System.out.println("Please try again.");
            }
        }


        // =========================
        // MAIN MENU
        // =========================

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("================================");
            System.out.println("         SMART LOAD");
            System.out.println("================================");
            System.out.println("[1] Data Promos");
            System.out.println("[2] Call & Text Promos");
            System.out.println("[3] Check Balance");
            System.out.println("[4] Exit");
            System.out.println("================================");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();


            switch (choice) {

                // =========================
                // DATA PROMOS
                // =========================

                case "1":

                    boolean dataMenu = true;

                    while (dataMenu) {

                        System.out.println();
                        System.out.println("--------- DATA PROMOS ---------");
                        System.out.println("[1] SURF10 - 1 GB - 1 Day - P10");
                        System.out.println("[2] SURF30 - 3 GB - 3 Days - P30");
                        System.out.println("[3] SURF50 - 5 GB - 5 Days - P50");
                        System.out.println("[4] Back");
                        System.out.println("--------------------------------");

                        System.out.print("Enter choice: ");
                        String dataChoice = scanner.nextLine();


                        switch (dataChoice) {

                            case "1":

                                System.out.println();
                                System.out.println("You selected SURF10.");
                                System.out.println("1 GB Data for 1 Day.");
                                System.out.println("Price: P10");

                                System.out.println();
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");

                                System.out.print("Enter choice: ");
                                String surf10Choice = scanner.nextLine();


                                if (surf10Choice.equals("1")) {

                                    if (balance >= 10) {

                                        balance = balance - 10;

                                        System.out.println();
                                        System.out.println("================================");
                                        System.out.println("   REGISTRATION SUCCESSFUL");
                                        System.out.println("================================");
                                        System.out.println("Promo: SURF10");
                                        System.out.println("Data: 1 GB");
                                        System.out.println("Duration: 1 Day");
                                        System.out.println("Amount Paid: P10");
                                        System.out.println(
                                                "Remaining Balance: P" + balance
                                        );
                                        System.out.println();
                                        System.out.println("Thank you for using Smart Load!");

                                        // Successful registration
                                        // means the application exits.
                                        running = false;
                                        dataMenu = false;

                                    } else {

                                        System.out.println();
                                        System.out.println("Insufficient load balance.");
                                        System.out.println("Please choose another option.");
                                    }

                                } else if (surf10Choice.equals("2")) {

                                    // Go back to Data Promos

                                } else {

                                    System.out.println("Invalid choice.");
                                }

                                break;


                            case "2":

                                System.out.println();
                                System.out.println("You selected SURF30.");
                                System.out.println("3 GB Data for 3 Days.");
                                System.out.println("Price: P30");

                                System.out.println();
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");

                                System.out.print("Enter choice: ");
                                String surf30Choice = scanner.nextLine();


                                if (surf30Choice.equals("1")) {

                                    if (balance >= 30) {

                                        balance = balance - 30;

                                        System.out.println();
                                        System.out.println("================================");
                                        System.out.println("   REGISTRATION SUCCESSFUL");
                                        System.out.println("================================");
                                        System.out.println("Promo: SURF30");
                                        System.out.println("Data: 3 GB");
                                        System.out.println("Duration: 3 Days");
                                        System.out.println("Amount Paid: P30");
                                        System.out.println(
                                                "Remaining Balance: P" + balance
                                        );
                                        System.out.println();
                                        System.out.println("Thank you for using Smart Load!");

                                        // Successful registration
                                        // means the application exits.
                                        running = false;
                                        dataMenu = false;

                                    } else {

                                        System.out.println();
                                        System.out.println("Insufficient load balance.");
                                        System.out.println("Please choose another option.");
                                    }

                                } else if (surf30Choice.equals("2")) {

                                    // Go back

                                } else {

                                    System.out.println("Invalid choice.");
                                }

                                break;


                            case "3":

                                System.out.println();
                                System.out.println("You selected SURF50.");
                                System.out.println("5 GB Data for 5 Days.");
                                System.out.println("Price: P50");

                                System.out.println();
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");

                                System.out.print("Enter choice: ");
                                String surf50Choice = scanner.nextLine();


                                if (surf50Choice.equals("1")) {

                                    if (balance >= 50) {

                                        balance = balance - 50;

                                        System.out.println();
                                        System.out.println("================================");
                                        System.out.println("   REGISTRATION SUCCESSFUL");
                                        System.out.println("================================");
                                        System.out.println("Promo: SURF50");
                                        System.out.println("Data: 5 GB");
                                        System.out.println("Duration: 5 Days");
                                        System.out.println("Amount Paid: P50");
                                        System.out.println(
                                                "Remaining Balance: P" + balance
                                        );
                                        System.out.println();
                                        System.out.println("Thank you for using Smart Load!");

                                        // Successful registration
                                        // means the application exits.
                                        running = false;
                                        dataMenu = false;

                                    } else {

                                        System.out.println();
                                        System.out.println("Insufficient load balance.");
                                        System.out.println("Please choose another option.");
                                    }

                                } else if (surf50Choice.equals("2")) {

                                    // Go back

                                } else {

                                    System.out.println("Invalid choice.");
                                }

                                break;


                            case "4":

                                // Go back to Main Menu
                                dataMenu = false;
                                break;


                            default:

                                System.out.println();
                                System.out.println("Invalid choice.");
                                System.out.println("Please try again.");
                        }
                    }

                    break;


                // =========================
                // CALL & TEXT PROMOS
                // =========================

                case "2":

                    boolean callTextMenu = true;

                    while (callTextMenu) {

                        System.out.println();
                        System.out.println("------ CALL & TEXT PROMOS ------");
                        System.out.println("[1] TALK10 - 1 Day - P10");
                        System.out.println("[2] TALK25 - 3 Days - P25");
                        System.out.println("[3] TALK40 - 5 Days - P40");
                        System.out.println("[4] Back");
                        System.out.println("--------------------------------");

                        System.out.print("Enter choice: ");
                        String callTextChoice = scanner.nextLine();


                        switch (callTextChoice) {

                            case "1":

                                System.out.println();
                                System.out.println("You selected TALK10.");
                                System.out.println("Unlimited Calls & Texts for 1 Day.");
                                System.out.println("Price: P10");

                                System.out.println();
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");

                                System.out.print("Enter choice: ");
                                String talk10Choice = scanner.nextLine();


                                if (talk10Choice.equals("1")) {

                                    if (balance >= 10) {

                                        balance = balance - 10;

                                        System.out.println();
                                        System.out.println("================================");
                                        System.out.println("   REGISTRATION SUCCESSFUL");
                                        System.out.println("================================");
                                        System.out.println("Promo: TALK10");
                                        System.out.println("Duration: 1 Day");
                                        System.out.println("Amount Paid: P10");
                                        System.out.println(
                                                "Remaining Balance: P" + balance
                                        );
                                        System.out.println();
                                        System.out.println("Thank you for using Smart Load!");

                                        running = false;
                                        callTextMenu = false;

                                    } else {

                                        System.out.println();
                                        System.out.println("Insufficient load balance.");
                                    }

                                } else if (talk10Choice.equals("2")) {

                                    // Go back

                                } else {

                                    System.out.println("Invalid choice.");
                                }

                                break;


                            case "2":

                                System.out.println();
                                System.out.println("You selected TALK25.");
                                System.out.println("Unlimited Calls & Texts for 3 Days.");
                                System.out.println("Price: P25");

                                System.out.println();
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");

                                System.out.print("Enter choice: ");
                                String talk25Choice = scanner.nextLine();


                                if (talk25Choice.equals("1")) {

                                    if (balance >= 25) {

                                        balance = balance - 25;

                                        System.out.println();
                                        System.out.println("================================");
                                        System.out.println("   REGISTRATION SUCCESSFUL");
                                        System.out.println("================================");
                                        System.out.println("Promo: TALK25");
                                        System.out.println("Duration: 3 Days");
                                        System.out.println("Amount Paid: P25");
                                        System.out.println(
                                                "Remaining Balance: P" + balance
                                        );
                                        System.out.println();
                                        System.out.println("Thank you for using Smart Load!");

                                        running = false;
                                        callTextMenu = false;

                                    } else {

                                        System.out.println();
                                        System.out.println("Insufficient load balance.");
                                    }

                                } else if (talk25Choice.equals("2")) {

                                    // Go back

                                } else {

                                    System.out.println("Invalid choice.");
                                }

                                break;


                            case "3":

                                System.out.println();
                                System.out.println("You selected TALK40.");
                                System.out.println("Unlimited Calls & Texts for 5 Days.");
                                System.out.println("Price: P40");

                                System.out.println();
                                System.out.println("[1] Subscribe");
                                System.out.println("[2] Back");

                                System.out.print("Enter choice: ");
                                String talk40Choice = scanner.nextLine();


                                if (talk40Choice.equals("1")) {

                                    if (balance >= 40) {

                                        balance = balance - 40;

                                        System.out.println();
                                        System.out.println("================================");
                                        System.out.println("   REGISTRATION SUCCESSFUL");
                                        System.out.println("================================");
                                        System.out.println("Promo: TALK40");
                                        System.out.println("Duration: 5 Days");
                                        System.out.println("Amount Paid: P40");
                                        System.out.println(
                                                "Remaining Balance: P" + balance
                                        );
                                        System.out.println();
                                        System.out.println("Thank you for using Smart Load!");

                                        running = false;
                                        callTextMenu = false;

                                    } else {

                                        System.out.println();
                                        System.out.println("Insufficient load balance.");
                                    }

                                } else if (talk40Choice.equals("2")) {

                                    // Go back

                                } else {

                                    System.out.println("Invalid choice.");
                                }

                                break;


                            case "4":

                                callTextMenu = false;
                                break;


                            default:

                                System.out.println();
                                System.out.println("Invalid choice.");
                                System.out.println("Please try again.");
                        }
                    }

                    break;


                // =========================
                // CHECK BALANCE
                // =========================

                case "3":

                    System.out.println();
                    System.out.println("--------- BALANCE ---------");
                    System.out.printf("Your current balance is: P%.2f%n", balance);
                    System.out.println("---------------------------");

                    break;


                // =========================
                // EXIT
                // =========================

                case "4":

                    System.out.println();
                    System.out.println("Thank you for using Smart Load!");
                    System.out.println("Goodbye!");

                    running = false;

                    break;


                // =========================
                // INVALID MAIN MENU CHOICE
                // =========================

                default:

                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please try again.");
            }
        }

        scanner.close();
    }
}
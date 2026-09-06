package com.joysistvi.stage1.day15;

import java.util.Scanner;

public class LoadRegistration {

    static Scanner sc = new Scanner(System.in);
    static double balance = 100.00;

    public static void main(String[] args) {
        validateUsedCode();
    }

    // ==========================================
    // VALIDATE USSD CODE
    // ==========================================

    public static void validateUsedCode() {

        while (true) {

            System.out.println();
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");

            String usedCode = sc.nextLine();

            if (usedCode.equals("*143#")) {

                mainMenu();
                return;

            } else {

                System.out.println("Invalid code. Please try again.");

            }
        }
    }

    // ==========================================
    // DATA PROMOS
    // ==========================================

    public static boolean DataPromos() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("          DATA PROMOS");
            System.out.println("================================");
            System.out.println("[1] GoSURF10 - 1GB - 1 Day - P10");
            System.out.println("[2] GoSURF30 - 3GB - 3 Days - P30");
            System.out.println("[3] GoSURF50 - 5GB - 5 Days - P50");
            System.out.println("[4] Back");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // BACK TO MAIN MENU
            if (choice == 4) {
                return false;
            }

            // CHECK VALID PROMO
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice.");
                continue;
            }

            // PROMO INFORMATION
            String promoName = "";
            String promoDetails = "";
            double price = 0;

            switch (choice) {

                case 1:
                    promoName = "GoSURF10";
                    promoDetails = "1GB - 1 Day";
                    price = 10;
                    break;

                case 2:
                    promoName = "GoSURF30";
                    promoDetails = "3GB - 3 Days";
                    price = 30;
                    break;

                case 3:
                    promoName = "GoSURF50";
                    promoDetails = "5GB - 5 Days";
                    price = 50;
                    break;
            }

            // REGISTRATION MENU
            while (true) {

                System.out.println();
                System.out.println("================================");
                System.out.println("          " + promoName);
                System.out.println("================================");
                System.out.println(promoDetails + " - P" + price);
                System.out.println();
                System.out.println("[1] Register " + promoName);
                System.out.println("[0] Back");
                System.out.println("================================");

                System.out.print("Enter your choice: ");
                int registerChoice = sc.nextInt();

                // REGISTER
                if (registerChoice == 1) {

                    if (balance >= price) {

                        balance -= price;

                        System.out.println();
                        System.out.println("================================");
                        System.out.println("     REGISTRATION SUCCESSFUL");
                        System.out.println("================================");
                        System.out.println("Promo: " + promoName);
                        System.out.println("Price: P" + price);
                        System.out.println("Remaining Balance: P" + balance);
                        System.out.println("================================");

                        return true;

                    } else {

                        System.out.println();
                        System.out.println("You don't have enough load.");
                        System.out.println("Current Balance: P" + balance);

                    }

                    // BACK TO DATA PROMOS
                } else if (registerChoice == 0) {

                    break;

                } else {

                    System.out.println("Invalid choice.");

                }
            }
        }
    }

    // ==========================================
    // CALL & TEXT PROMOS
    // ==========================================

    public static boolean callTextPromos() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("       CALL & TEXT PROMOS");
            System.out.println("================================");
            System.out.println("[1] GoUNLI10 - 1 Day - P10");
            System.out.println("[2] GoUNLI25 - 3 Days - P25");
            System.out.println("[3] GoUNLI40 - 5 Days - P40");
            System.out.println("[4] Back");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                return false;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice.");
                continue;
            }

            String promoName = "";
            String promoDetails = "";
            double price = 0;

            switch (choice) {

                case 1:
                    promoName = "GoUNLI10";
                    promoDetails = "Unlimited Calls & Text - 1 Day";
                    price = 10;
                    break;

                case 2:
                    promoName = "GoUNLI25";
                    promoDetails = "Unlimited Calls & Text - 3 Days";
                    price = 25;
                    break;

                case 3:
                    promoName = "GoUNLI40";
                    promoDetails = "Unlimited Calls & Text - 5 Days";
                    price = 40;
                    break;
            }

            while (true) {

                System.out.println();
                System.out.println("================================");
                System.out.println("          " + promoName);
                System.out.println("================================");
                System.out.println(promoDetails + " - P" + price);
                System.out.println();
                System.out.println("[1] Register " + promoName);
                System.out.println("[0] Back");
                System.out.println("================================");

                System.out.print("Enter your choice: ");
                int registerChoice = sc.nextInt();

                if (registerChoice == 1) {

                    if (balance >= price) {

                        balance -= price;

                        System.out.println();
                        System.out.println("================================");
                        System.out.println("     REGISTRATION SUCCESSFUL");
                        System.out.println("================================");
                        System.out.println("Promo: " + promoName);
                        System.out.println("Price: P" + price);
                        System.out.println("Remaining Balance: P" + balance);
                        System.out.println("================================");

                        return true;

                    } else {

                        System.out.println();
                        System.out.println("You don't have enough load.");
                        System.out.println("Current Balance: P" + balance);

                    }

                } else if (registerChoice == 0) {

                    break;

                } else {

                    System.out.println("Invalid choice.");

                }
            }
        }
    }

    // ==========================================
    // CHECK BALANCE
    // ==========================================

    public static void checkBalance() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("          CHECK BALANCE");
            System.out.println("================================");
            System.out.println("Current Load: P" + balance);
            System.out.println("================================");
            System.out.println("[0] Back");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {

                return;

            } else {

                System.out.println("Invalid choice.");

            }
        }
    }

    // ==========================================
    // LOAN
    // ==========================================

    public static void loan() {

        while (true) {

            System.out.println();
            System.out.println("================================");
            System.out.println("             LOAN");
            System.out.println("================================");
            System.out.println("[1] Borrow P20");
            System.out.println("[0] Back");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                balance += 20;

                System.out.println();
                System.out.println("You have successfully borrowed P20.");
                System.out.println("Current Balance: P" + balance);

                return;

            } else if (choice == 0) {

                return;

            } else {

                System.out.println("Invalid choice.");

            }
        }
    }

    // ==========================================
    // MAIN MENU
    // ==========================================

    public static void mainMenu() {

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("================================");
            System.out.println("           GLOBE LOAD");
            System.out.println("================================");
            System.out.println("[1] Data Promos");
            System.out.println("[2] Call & Text Promos");
            System.out.println("[3] Check Balance");
            System.out.println("[4] Loans");
            System.out.println("[5] Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (DataPromos()) {
                        running = false;
                    }

                    break;

                case 2:

                    if (callTextPromos()) {
                        running = false;
                    }

                    break;

                case 3:

                    checkBalance();

                    break;

                case 4:

                    loan();

                    break;

                case 5:

                    System.out.println();
                    System.out.println("Thank you for using Globe Load!");

                    running = false;

                    break;

                default:

                    System.out.println("Invalid choice.");

            }
        }
    }
}
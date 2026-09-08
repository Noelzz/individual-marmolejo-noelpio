package com.joysistvi.stage2.day17;

import java.util.Scanner;

public class Activity12_Marmolejo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("         JAVA METHODS ACTIVITY 12");
            System.out.println("======================================");
            System.out.println("[1]  Odd or Even");
            System.out.println("[2]  Print Name 50 Times");
            System.out.println("[3]  Square Root");
            System.out.println("[4]  Power of a Number");
            System.out.println("[5]  Random Number (1-100)");
            System.out.println("[6]  Area of a Circle");
            System.out.println("[7]  Voter Checker");
            System.out.println("[8]  Length of a Word");
            System.out.println("[9]  Reverse a Word");
            System.out.println("[10] Full Name and Age");
            System.out.println("[0]  Exit");
            System.out.println("======================================");

            System.out.print("Choose a method: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    String result = getOddOrEven(number);

                    System.out.println(number + " is " + result + ".");
                    break;

                case 2:
                    printName50Times();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double sqrtNumber = sc.nextDouble();

                    double squareRoot = getSquareRoot(sqrtNumber);

                    System.out.println("Square root = " + squareRoot);
                    break;

                case 4:
                    System.out.print("Enter the base: ");
                    double base = sc.nextDouble();

                    System.out.print("Enter the exponent: ");
                    double exponent = sc.nextDouble();

                    double power = getPower(base, exponent);

                    System.out.println("Result = " + power);
                    break;

                case 5:
                    int random = getRandomNumber();

                    System.out.println("Random number: " + random);
                    break;

                case 6:
                    System.out.print("Enter the radius: ");
                    double radius = sc.nextDouble();

                    double area = getCircleArea(radius);

                    System.out.println("Area of the circle = " + area);
                    break;

                case 7:
                    System.out.print("Enter your age: ");
                    int age = sc.nextInt();

                    boolean voter = isVoter(age);

                    if (voter) {
                        System.out.println("You are eligible to vote.");
                    } else {
                        System.out.println("You are NOT eligible to vote.");
                    }
                    break;

                case 8:
                    sc.nextLine();

                    System.out.print("Enter a word: ");
                    String word = sc.nextLine();

                    int length = getWordLength(word);

                    System.out.println("Length of the word = " + length);
                    break;

                case 9:
                    sc.nextLine();

                    System.out.print("Enter a word: ");
                    String wordToReverse = sc.nextLine();

                    String reversed = reverseWord(wordToReverse);

                    System.out.println("Reversed word = " + reversed);
                    break;

                case 10:
                    fullNameAndAge();
                    break;

                case 0:
                    System.out.println("Program ended. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose from 0-10.");
            }

        } while (choice != 0);

        sc.close();
    }


    // 1. Identify if a number is odd or even
    // Return Type: String
    static String getOddOrEven(int number) {

        if (number % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }


    // 2. Print your name 50 times
    // Return Type: void
    static void printName50Times() {

        String name = "Noel Pio N. Marmolejo";

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }


    // 3. Get the square root of a number
    // Return Type: double
    static double getSquareRoot(double number) {

        return Math.sqrt(number);
    }


    // 4. Get the power of a number
    // Return Type: double
    static double getPower(double base, double exponent) {

        return Math.pow(base, exponent);
    }


    // 5. Get a random number between 1 and 100
    // Return Type: int
    static int getRandomNumber() {

        return (int) (Math.random() * 100) + 1;
    }


    // 6. Get the area of a circle
    // Return Type: double
    static double getCircleArea(double radius) {

        return Math.PI * radius * radius;
    }


    // 7. Identify if a person is a voter
    // Return Type: boolean
    static boolean isVoter(int age) {

        return age >= 18;
    }


    // 8. Get the length of a word
    // Return Type: int
    static int getWordLength(String word) {

        return word.length();
    }


    // 9. Reverse a word
    // Return Type: String
    static String reverseWord(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reversed += word.charAt(i);
        }

        return reversed;
    }


    // 10. Print full name and age
    // Return Type: void
    static void fullNameAndAge() {

        String fullName = "Noel Pio N. Marmolejo";
        int age = 25; // Change this to your actual age

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }
}
package com.joysistvi.stage1.day5;

public class Activity3_Marmolejo {

    public static void main(String[] args) {

        // 1. Logical AND operator (&&)
        int age = 20;
        boolean hasValidID = true;

        boolean allowedToEnter = age >= 18 && hasValidID;

        System.out.println("=== Event Entry ===");
        System.out.println("Age: " + age);
        System.out.println("Has valid ID: " + hasValidID);
        System.out.println("Allowed to enter: " + allowedToEnter);


        // 2. Logical OR operator (||)
        boolean isWeekend = false;
        boolean isHoliday = true;

        boolean noClasses = isWeekend || isHoliday;

        System.out.println("\n=== Classes ===");
        System.out.println("Is weekend: " + isWeekend);
        System.out.println("Is holiday: " + isHoliday);
        System.out.println("No classes today: " + noClasses);


        // 3. Ternary operator - Passed or Failed
        int score = 80;

        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println("\n=== Student Result ===");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);


        // 4. Ternary operator - Larger number
        int num = 25;
        int num2 = 40;

        int largerNumber = (num > num2) ? num : num2;

        System.out.println("\n=== Larger Number ===");
        System.out.println("First number: " + num);
        System.out.println("Second number: " + num2);
        System.out.println("Larger number: " + largerNumber);
    }
}
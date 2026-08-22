package com.joysistvi.stage1.day4;

public class Activity2_Marmolejo {
    public static void main(String[] args) {

        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculate percentage of each expense
        double foodPercentage = (foodAllowance / income) * 100;
        double transportationPercentage = (transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilityPercentage = (utilityBill / income) * 100;

        // Calculate total expenses
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double totalExpensesPercentage = (totalExpenses / income) * 100;

        // Calculate remaining balance
        double remainingBalance = income - totalExpenses;
        double remainingPercentage = (remainingBalance / income) * 100;

        // Display results
        System.out.println("===== Activity 2: Income and Expenses =====");
        System.out.println("Income: " + income);

        System.out.printf("Food Allowance: %.2f (%.1f%%)%n", foodAllowance, foodPercentage);

        System.out.printf("Transportation: %.2f (%.1f%%)%n",
                transportation, transportationPercentage);

        System.out.printf("Rent: %.2f (%.1f%%)%n",
                rent, rentPercentage);

        System.out.printf("Utility Bill: %.2f (%.1f%%)%n",
                utilityBill, utilityPercentage);

        System.out.println();

        System.out.printf("Total Expenses: %.2f (%.1f%%)%n",
                totalExpenses, totalExpensesPercentage);

        System.out.printf("Remaining Balance: %.2f (%.1f%%)%n",
                remainingBalance, remainingPercentage);
    }
}

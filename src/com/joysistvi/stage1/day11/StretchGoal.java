package com.joysistvi.stage1.day11;

public class StretchGoal {
    public static void main(String[] args) {

        String country = "Philippines";

        // Display the first and last character
        System.out.println("Country: " + country);
        System.out.println("First character: " + country.charAt(0));
        System.out.println("Last character: " + country.charAt(country.length() - 1));

        // Count P/p and vowels
        int pCount = 0;
        int vowelCount = 0;

        for (char character : country.toCharArray()) {

            // Count P/p
            if (character == 'P' || character == 'p') {
                pCount++;
            }

            // Count vowels
            if (character == 'a' || character == 'e' ||
                    character == 'i' || character == 'o' ||
                    character == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}


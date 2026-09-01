package com.joysistvi.stage1.day11;

public class StretchGoal {

    public static void main(String[] args) {

        String country = "Philippines";

        System.out.println("Country: " + country);
        System.out.println("First character: " + country.charAt(0));
        System.out.println("Last character: " + country.charAt(country.length() - 1));

        int pCount = 0;
        int vowelCount = 0;

        for (char c : country.toLowerCase().toCharArray()) {

            if (c == 'p') {
                pCount++;
            }

            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}




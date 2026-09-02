package com.joysistvi.stage1.day11;

import java.sql.SQLOutput;

public class Presentation {
    static void main(String[] args) {
         /*
        1. contains()
        Description: Checks if a string contains a specific sequence of characters.
        Syntax: string.contains(sequence)
        */
        String email = "noel@gmail.com";

        System.out.println("1. contains()");
        System.out.println(email.contains("oe"));



        if (email.contains("@")) {
            System.out.println("Email format looks valid.");
        } else {
            System.out.println("Invalid email.");
        }






    }
}

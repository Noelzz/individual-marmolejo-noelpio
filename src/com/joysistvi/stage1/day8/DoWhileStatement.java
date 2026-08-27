package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.print("Type 'exit' to stop: ");
            input = scanner.nextLine();

        } while (!input.equals("exit"));

        System.out.println("Program stopped!");

        scanner.close();
    }
}
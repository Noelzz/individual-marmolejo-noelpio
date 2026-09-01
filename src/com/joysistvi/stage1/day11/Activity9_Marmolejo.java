package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Marmolejo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("         Average Calculator");
        System.out.println("=================================");

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Ask for number of subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine();

        // Arrays
        String[] subjects = new String[numberOfSubjects];
        String[] studentNames = new String[numberOfStudents];

        // Multi-dimensional array for grades
        double[][] grades = new double[numberOfStudents][numberOfSubjects];

        // Array for student averages
        double[] averages = new double[numberOfStudents];

        // Input subject names
        System.out.println();
        System.out.println("Enter subject names:");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println();
            System.out.print("Name of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");

            double total = 0;

            for (int j = 0; j < numberOfSubjects; j++) {

                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextDouble();

                total += grades[i][j];
            }

            // Calculate average
            averages[i] = total / numberOfSubjects;

            scanner.nextLine();
        }

        // Display Grades Report
        System.out.println();
        System.out.println("==============================================");
        System.out.println("                Grades Report");
        System.out.println("==============================================");

        System.out.printf("%-15s", "Student");

        for (String subject : subjects) {
            System.out.printf("%-12s", subject);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("--------------------------------------------------------------");

        // Display results
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
            }

            System.out.printf("%.2f%n", averages[i]);
        }

        scanner.close();
    }
}
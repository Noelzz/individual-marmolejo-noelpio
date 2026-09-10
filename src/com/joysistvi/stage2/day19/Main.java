package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Winter", 23, "BSCPE,","Molave", "Malabon");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Id : ");
        student.setId(input.nextInt());
        input.nextLine();

        System.out.print("Enter Name : ");
        student.setName(input.nextLine());

        System.out.print("Enter Age : ");
        student.setAge(input.nextInt());
        input.nextLine();

        System.out.print("Enter Course : ");
        student.setCourse(input.nextLine());

        System.out.print("Section : ");
        student.setSection(input.nextLine());

        System.out.print("Enter Address : ");
        student.setAddress(input.nextLine());

        System.out.println();

        System.out.println("Student Profile");
        System.out.println("----------------------");
        System.out.println("ID      : " + student.getId());
        System.out.println("Name    : " + student.getName());
        System.out.println("Age     : " + student.getAge());
        System.out.println("Course  : " + student.getCourse());
        System.out.println("Section : " + student.getSection());
        System.out.println("Address : " + student.getAddress());

        input.close();
    }
}
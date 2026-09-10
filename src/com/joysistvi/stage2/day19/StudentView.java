package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Id : ");
        int id =  input.nextInt();



        System.out.print("Enter Name : ");
        String name = input.nextLine();



        System.out.print("Enter Age : ");
        int age = input.nextInt();



        System.out.print("Enter Course : ");
        String course = input.nextLine();


        System.out.print("Enter Section : ");
        String section = input.nextLine();


        System.out.print("Enter Address : ");
        String address = input.nextLine();


        Student student = new Student(id, name, 23, course, section, address);


        System.out.println();

        System.out.println("Student Profile");
        System.out.println("----------------------");
        System.out.println("ID      : " + student.getId());
        System.out.println("Name    : " + student.getName());
        System.out.println("Age     : " + student.getAge());
        System.out.println("Course  : " + student.getCourse());
        System.out.println("Section : " + student.getSection());
        System.out.println("Address : " + student.getAddress());

    }
}

package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class SingleDimensionalArray {
    static void main(String[] args) {
        String[] cars = {"Sedan", "Suv", "Pickup", "EV" , "Van" };

        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        for(String car:cars){
            System.out.println(car);
        }


        int evenNumbers[] = new int[5];
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;
        evenNumbers[4] = 10;

        System.out.println(evenNumbers[4]);

        Scanner input = new Scanner(System.in);

        // Syntax -> Declare an array with a specified size only
        // DataType object = new DataType[5];

        int[] evenNumberss = new int[5];

        System.out.println("Enter the first five even numbers: ");
        for (int i = 0; i < evenNumbers.length; i++) {

            evenNumberss[i] = input.nextInt();
        }

        System.out.print("\nTraversing even numbers: ");
        for (int evenNumber : evenNumberss) {
            System.out.print(evenNumber + " ");
        }
    }
}

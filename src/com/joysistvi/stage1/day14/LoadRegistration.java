package com.joysistvi.stage1.day14;

import java.util.Scanner;

public class LoadRegistration {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        validateUsedCode();

    }

    public static void validateUsedCode() {

        System.out.println("Dial *143# to access Globe Services ");
        System.out.print("Enter Globe Code : ");
        String usedCode = sc.nextLine();

        if (!usedCode.equals("*143")) {
            System.out.println("Invalid code");

        }
        if(usedCode.equals("*143#")){
            mainMenu();

        }


    }

    public static void mainMenu(){
        System.out.println("*** Load Registration ***");
        System.out.println("* [1] Unli Text");
        System.out.println("* [2] Unli Call");
        System.out.println("* [3] Go Surf");
        System.out.println("* [4] Check Balance");
        System.out.println("* [5] Burrow Load");
        System.out.println("* [0] Exit");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice){

            case 1:
                System.out.println("Registered");
                break;
            case 2:
                System.out.println("Unli Call Registered");
                break;
            case 3:
                System.out.println("Go Surf Registered");
                break;
            case 4:
                System.out.println("Check Balance");
                break;
            case 5:
                System.out.println("Burrow Load");
                break;
            case 0:
                System.out.println("Exit");
                break;
        }
    }

}

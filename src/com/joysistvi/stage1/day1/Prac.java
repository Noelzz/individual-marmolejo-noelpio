package com.joysistvi.stage1.day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Word : ");
     String word = sc.nextLine();

     String reverse = "";

     for(int i = word.length() - 1; i>=0; i--){
         reverse = reverse + word.charAt(i);
     }

     System.out.println(reverse);

     if(word.equals(reverse)){
         System.out.println("Palindrome");
     }else {
         System.out.println("Not Palindrome");
     }

    }

}




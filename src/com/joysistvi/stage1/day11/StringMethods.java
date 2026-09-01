package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class StringMethods{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        1. contains()
        Description: Checks if a string contains a specific sequence of characters.
        Syntax: string.contains(sequence)
        */
        String name = "Noel";

        System.out.println("1. contains()");
        System.out.println(name.contains("oe"));


        /*
        2. endsWith()
        Description: Checks if a string ends with a specific sequence of characters.
        Syntax: string.endsWith(suffix)
        */
        System.out.println("\n2. endsWith()");
        System.out.println(name.endsWith("el"));


        /*
        3. startsWith()
        Description: Checks if a string starts with a specific sequence of characters.
        Syntax: string.startsWith(prefix)
        */
        System.out.println("\n3. startsWith()");
        System.out.println(name.startsWith("No"));


        /*
        4. indexOf()
        Description: Finds the position or index of a character or text in a string.
        Syntax: string.indexOf(value)
        */
        System.out.println("\n4. indexOf()");
        System.out.println(name.indexOf("e"));


        /*
        5. isEmpty()
        Description: Checks whether a string contains no characters.
        Syntax: string.isEmpty()
        */
        String emptyText = "";

        System.out.println("\n5. isEmpty()");
        System.out.println(emptyText.isEmpty());


        /*
        6. trim()
        Description: Removes spaces from the beginning and end of a string.
        Syntax: string.trim()
        */
        String spacedName = "  Noel  ";

        System.out.println("\n6. trim()");
        System.out.println(spacedName.trim());


        /*
        7. replace()
        Description: Replaces characters or text with another character or text.
        Syntax: string.replace(old, new)
        */
        System.out.println("\n7. replace()");
        System.out.println(name.replace("o", "a"));


        /*
        8. toCharArray()
        Description: Converts a String into an array of characters.
        Syntax: string.toCharArray()
        */
        String word = "Java";
        char[] letters = word.toCharArray();

        System.out.println("\n8. toCharArray()");

        for (char letter : letters) {
            System.out.println(letter);
        }


        /*
        9. nextLine().charAt()
        Description: Reads a line from the user and gets a character
        from a specific position.
        Syntax: scanner.nextLine().charAt(index)
        */
        System.out.println("\n9. nextLine().charAt()");

        System.out.print("Enter a word: ");
        char firstLetter = scanner.nextLine().charAt(0);

        System.out.println("First character: " + firstLetter);


        /*
        10. valueOf()
        Description: Converts a value, such as a number or character, into a String.
        Syntax: String.valueOf(value)
        */
        int age = 20;
        String text = String.valueOf(age);

        System.out.println("\n10. valueOf()");
        System.out.println(text);


        scanner.close();
    }
}


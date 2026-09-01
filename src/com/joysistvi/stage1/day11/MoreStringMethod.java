package com.joysistvi.stage1.day11;

import java.util.Arrays;

public class MoreStringMethod {

    public static void main(String[] args) {

        /*
        1. length()
        Description: Returns the number of characters in a string.
        Syntax: string.length()
        */
        String name = "Noel";

        System.out.println("1. length()");
        System.out.println(name.length());


        /*
        2. charAt()
        Description: Returns the character at a specific index.
        Syntax: string.charAt(index)
        */
        System.out.println("\n2. charAt()");
        System.out.println(name.charAt(0));


        /*
        3. equals()
        Description: Compares two strings and checks if they have the same content.
        Syntax: string.equals(anotherString)
        */
        System.out.println("\n3. equals()");
        System.out.println(name.equals("Noel"));


        /*
        4. equalsIgnoreCase()
        Description: Compares two strings without considering uppercase or lowercase.
        Syntax: string.equalsIgnoreCase(anotherString)
        */
        System.out.println("\n4. equalsIgnoreCase()");
        System.out.println(name.equalsIgnoreCase("NOEL"));


        /*
        5. toUpperCase()
        Description: Converts all characters in a string to uppercase.
        Syntax: string.toUpperCase()
        */
        System.out.println("\n5. toUpperCase()");
        System.out.println(name.toUpperCase());


        /*
        6. toLowerCase()
        Description: Converts all characters in a string to lowercase.
        Syntax: string.toLowerCase()
        */
        System.out.println("\n6. toLowerCase()");
        System.out.println(name.toLowerCase());


        /*
        7. substring()
        Description: Returns a portion of a string from a specified index.
        Syntax: string.substring(startIndex, endIndex)
        */
        String country = "Philippines";

        System.out.println("\n7. substring()");
        System.out.println(country.substring(0, 4));


        /*
        8. concat()
        Description: Joins one string to the end of another string.
        Syntax: string.concat(anotherString)
        */
        String firstName = "Noel";

        System.out.println("\n8. concat()");
        System.out.println(firstName.concat(" Marmolejo"));


        /*
        9. lastIndexOf()
        Description: Finds the index of the last occurrence of a character or text.
        Syntax: string.lastIndexOf(value)
        */
        String word = "banana";

        System.out.println("\n9. lastIndexOf()");
        System.out.println(word.lastIndexOf("a"));


        /*
        10. matches()
        Description: Checks if a string matches a specified pattern.
        Syntax: string.matches(regex)
        */
        String number = "123";

        System.out.println("\n10. matches()");
        System.out.println(number.matches("\\d+"));


        /*
        11. split()
        Description: Splits a string into an array using a specified separator.
        Syntax: string.split(separator)
        */
        String fruits = "Apple,Banana,Mango";
        String[] fruitArray = fruits.split(",");

        System.out.println("\n11. split()");

        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }


        /*
        12. isBlank()
        Description: Checks if a string is empty or contains only whitespace.
        Syntax: string.isBlank()
        */
        String blankText = "   ";

        System.out.println("\n12. isBlank()");
        System.out.println(blankText.isBlank());


        /*
        13. strip()
        Description: Removes whitespace from the beginning and end of a string.
        Syntax: string.strip()
        */
        String spacedText = "  Java  ";

        System.out.println("\n13. strip()");
        System.out.println(spacedText.strip());


        /*
        14. repeat()
        Description: Repeats a string a specified number of times.
        Syntax: string.repeat(count)
        */
        System.out.println("\n14. repeat()");
        System.out.println("Hi ".repeat(3));


    }
}


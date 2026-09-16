package com.joysistvi.stage2.discussion.day23;

public class ProceduralProgramming {
// Procedural Programming Approach
    /*
        This programming style relies on procedures or routines(methods/function) to operate on data, where data and behavior are handled separately.
     */

    // Example: We want to create a variable(s) that will describe a pet.
    // name, ageInMonths, classfication, gender, sound, breed
    String petAName = "Winter";
    int petAgeInmonths = 5;
    String petClassification = "Dog";
    String petGender = "Male";
    String petSound = "Bark bark";
    String petBreed = "Husky";

    public static void describePet(String petAName, int petAgeInmonths, String petClassification, String petGender, String petSound, String petBreed) {
        System.out.println(petAName + " is a " + petGender + petClassification + " who is " + petAgeInmonths + " years of age in months and breed is " + petBreed );
    }

    public static void makeSound(String petAName, String petSound) {
        System.out.println(petAName + " says " + petSound + "!");
    }

}

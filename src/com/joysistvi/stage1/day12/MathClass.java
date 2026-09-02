package com.joysistvi.stage1.day12;

public class MathClass {
    static void main(String[] args) {
        int roll = (int) (Math.random() * 75) + 1;

        String letter;

        if (roll <= 15) { // 1 - 15
            letter = "B";
        } else if (roll <= 30) { // 16 - 30
            letter = "I";
        } else if (roll <= 45) { // 31 - 45
            letter = "N";
        } else if (roll <= 60) { // 46 - 60
            letter = "G";
        } else {
            letter = "O"; // 60 - 75
        }

        System.out.println("Sa letra ng " + letter + ": " + roll);

    }
}

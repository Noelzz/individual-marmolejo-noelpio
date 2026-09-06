package com.joysistvi.stage1.day12;

public class Activity11_Marmolejo {

    public static void main(String[] args) {

        /*
        1. abs()
        Description: Returns the absolute value of a number.
        Syntax: Math.abs(number)
        */
        int number = -25;

        System.out.println("1. abs()");
        System.out.println(Math.abs(number));


        /*
        2. max()
        Description: Returns the larger of two values.
        Syntax: Math.max(value1, value2)
        */
        int a = 10;
        int b = 20;

        System.out.println("\n2. max()");
        System.out.println(Math.max(a, b));


        /*
        3. min()
        Description: Returns the smaller of two values.
        Syntax: Math.min(value1, value2)
        */
        System.out.println("\n3. min()");
        System.out.println(Math.min(a, b));


        /*
        4. pow()
        Description: Raises a number to a specified power.
        Syntax: Math.pow(base, exponent)
        */
        double base = 2;
        double exponent = 3;

        System.out.println("\n4. pow()");
        System.out.println(Math.pow(base, exponent));


        /*
        5. sqrt()
        Description: Returns the square root of a number.
        Syntax: Math.sqrt(number)
        */
        double square = 25;

        System.out.println("\n5. sqrt()");
        System.out.println(Math.sqrt(square));


        /*
        6. round()
        Description: Rounds a decimal number to the nearest whole number.
        Syntax: Math.round(number)
        */
        double decimalNumber = 5.7;

        System.out.println("\n6. round()");
        System.out.println(Math.round(decimalNumber));


        /*
        7. ceil()
        Description: Rounds a decimal number up to the nearest whole number.
        Syntax: Math.ceil(number)
        */
        double decimalNumber2 = 5.2;

        System.out.println("\n7. ceil()");
        System.out.println(Math.ceil(decimalNumber2));


        /*
        8. floor()
        Description: Rounds a decimal number down to the nearest whole number.
        Syntax: Math.floor(number)
        */
        double decimalNumber3 = 5.8;

        System.out.println("\n8. floor()");
        System.out.println(Math.floor(decimalNumber3));


        /*
        9. random()
        Description: Generates a random decimal number from 0.0 up to but not including 1.0.
        Syntax: Math.random()
        */
        System.out.println("\n9. random()");
        System.out.println(Math.random());


        /*
        10. log()
        Description: Returns the natural logarithm of a number using base e.
        Syntax: Math.log(number)
        e = 2.718281828459045
        */
        double logNumber = 10;

        System.out.println("\n10. log()");
        System.out.println(Math.log(logNumber));


        /*
        11. log10()
        Description: Returns the logarithm of a number using base 10.
        Syntax: Math.log10(number)
        */
        double log10Number = 100;

        System.out.println("\n11. log10()");
        System.out.println(Math.log10(log10Number));


        /*
        12. exp()
        Description: Returns e raised to the power of a specified number.
        Syntax: Math.exp(number)
        e = 2.718281828459045
        */
        double expNumber = 2;

        System.out.println("\n12. exp()");
        System.out.println(Math.exp(expNumber));


        /*
        13. sin()
        Description: Returns the sine of an angle in radians.
        Syntax: Math.sin(angle)
        */
        double angle = Math.toRadians(90);

        System.out.println("\n13. sin()");
        System.out.println(Math.sin(angle));


        /*
        14. cos()
        Description: Returns the cosine of an angle in radians.
        Syntax: Math.cos(angle)
        */
        double angle2 = Math.toRadians(60);

        System.out.println("\n14. cos()");
        System.out.println(Math.cos(angle2));


        /*
        15. tan()
        Description: Returns the tangent of an angle in radians.
        Syntax: Math.tan(angle)
        */
        double angle3 = Math.toRadians(45);

        System.out.println("\n15. tan()");
        System.out.println(Math.tan(angle3));
    }
}

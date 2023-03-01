package lv.acodemy.classroom;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        //byte data type
        byte myCurrentAge = 30;
        System.out.println(myCurrentAge);

        //short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        //char data type
        char firstNameLetter = 110; // 'n'
        System.out.println(firstNameLetter);

        //int data type
        int dateOfBirth = 171192;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 1880000000;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 32.30F;
        System.out.println(lapTime);

        //double data type
        double weight = 71.554866;
        System.out.println(weight);

        //boolean is; has; data type
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;


        //String data type
        String name = "Artis";
        String surName = "Anspoks";

        //Concatenation
        String fullName = name + " " + surName;
        System.out.println(fullName);

        //string fullNameWithAge = fullName + myCurrentAge;
        // Artis Anspoks30

        System.out.printf("My full name is: %s, I am %d years old \n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s, I am %d years old \n", fullName, myCurrentAge);

        // *
        int a = 10;
        int b = 20;
        double c = a * b;
        System.out.println(c);
        System.out.println(10 * 30);
        System.out.println(a * b);

        //  /
        c = (double) a / b;
        System.out.println(c);

        // %
        int number = 10 % 9;
        System.out.println(number);
        // vajag, kad atrast tikai para ciparus

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));


    }
}

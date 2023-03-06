package lv.acodemy.classroom;

import java.sql.SQLOutput;

public class IfElse {
    public static void main(String[] args) {

        // IF
        /*
        if(condition) {
        code to be executed
        }
         */
        boolean x = 5 > 2;
        System.out.println(x);

        if (x) {
            System.out.println("Yes, 5 is more than 2");
        }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even");
        } else {
            System.out.println("Number: " + number + " in NOT even number");
        }

        int age = 18;
        if (age <= 17) {
            System.out.println("You are not allowed to buy here");
        } else {
            System.out.println("Welcome to our shop");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println(" Summer months: June, July, August");
        }

        // IF-ELSE-IF

        /*
        if(condition) {
        code to be executed
        } else if(condition) {
        code to be executed
        } else {
        code to be executed
        }
        ... nav ierobezojumu
         */

        int myAge = 20;
        if (myAge <= 0) {
            System.out.println("Who are you?");
        } else if (myAge <= 17) {
            System.out.println("You are not allowed to buy here");
        } else {
            System.out.println("Welcome to our shop!");
        }

        // If John = hello John!
        // if Zina = You are not welcome!
        // All others = Text

        String name = "Max";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Zina")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }

        //switch case;
        // || or
        // && and

        int currentMonth = 11;
        switch (currentMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("This is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autum");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentMonth);
        }


        // IF student 1 = "John" and student2 = "Max"
        // print: the will wor together
        // &&;

        String student1 = "John";
        String student2 = "Anna";
        if (student1.equals("John") && student2.equals("Max")) {
            System.out.println("They will work together");
        } else if (student1.equals("John") || student2.equals("John")) {
            System.out.println("Search for Max");
        } else if (student1.equals("Max") || student2.equals("Max")) {
            System.out.println("Search for John");
        }
    }
}

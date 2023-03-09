package lv.acodemy.homework;

import javax.management.StringValueExp;
import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {
        // task 1
        byte myAge = 30;
        String myName = "Artis";
        String mySurname = "Anspoks";
        String myCity = "Rīga";
        String myStreet = "Pils laukums";
        byte myHomeNumber = 10;
        byte myApartmentNumber = 127;
        char myPostCode1 = 76, myPostCode2 = 86, myPostCode3 = 45;
        short myPostCode4 = 1001;

        // task 2

        String fullName = myName + " " + mySurname;
        String fullAddress = myCity + "," + myStreet + "," + myHomeNumber + "-" + myApartmentNumber;

        System.out.printf("Hello, my name is %s and I am %d years old. \n", fullName, myAge);
        System.out.printf("MY full address where I live: %s \n", fullAddress);
        System.out.printf("Post Code: %s%s%s%s \n", myPostCode1, myPostCode2, myPostCode3, myPostCode4);

        // task 3
        // there is 66 kg of apples, one person can collect 5 kg, there was 7 collectors. How much apples left.

        byte a = 5;
        byte b = 7;
        byte c = 66;

         int d = c - a * b;
        System.out.printf("%s apples left \n", d);

        // find average



        short values[] = { 214, 240, 255, 261, 280, 285, 305, 327, 345};

        short sum = 0;
        for (short i = 0; i < values.length; i++)
            sum += values[i];

        double average = ((double) sum) / values.length;



        System.out.println(average);



    }


}
//create 2 variable for each data type (meaningful)
// concatenation write bout myself
//play with operators- +, -, %, /...
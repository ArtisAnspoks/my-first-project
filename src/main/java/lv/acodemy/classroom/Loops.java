package lv.acodemy.classroom;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*
        for(int i = 0; i < 10; i++) {
        // define counter
        //condition
        //increment
         */

        for (int i = 0; i < 5; i++) {
            System.out.print("Hello World!" + " ");
        }
        System.out.println();

        //numbers [0]=1
        //numbers [1]=2


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int number :
                numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //create Strig array with 10 names
        //print all names using for & for each

        String[] names = {"art1", "art2", "art3", "art4", "art5", "art6", "art7", "art8", "art9", "art10"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("art1") ||
                    names[i].equals("art2") ||
                    names[i].equals("art3") ||
                    names[i].equals("art4"))
                System.out.print(names[i] + " ");
        }

        System.out.println();
        System.out.println("For each");
        for (String nameForEach :
                names) {
            System.out.print(nameForEach + " ");
        }
        System.out.println();

        // do, do while
        /*
        do {
        //code to be executed
        }(while is true)
         */

        int i = 6;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();


        int x = 7;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        int[] arrayOfNum = {1,2,3,4,5,6,7,8,9,10};
        int[] emptyArray = new int[arrayOfNum.length];

        for (int j = 0; j < numbers.length; j++) {
            emptyArray[j]= arrayOfNum[j];
            System.out.println();

            System.out.print(emptyArray[j] + " ");
            System.out.println(Arrays.toString(emptyArray));
        }

        System.out.println();



        }

        }

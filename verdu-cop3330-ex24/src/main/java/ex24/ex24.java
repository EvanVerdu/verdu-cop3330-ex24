package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex24 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Anagram;
        int length1;
        int length2;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String Input1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String Input2 = scanner.nextLine();

        length1 = Input1.length();
        length2 = Input2.length();

        if (length1 == length2) {
            Anagram = isAnagram(Input1, Input2);

            if (Anagram == 1){
                System.out.print( Input1 + " and " + Input2 + " are anagrams. ");
            }
            else {
               System.out.print( Input1 + " and " + Input2 + " are not anagrams. ");
            }

        }

        else {
            System.out.print("Please enter two strings of the same length. ");
            System.exit(0);
        }




    }

    public static int isAnagram (String Input1, String Input2){

           char[] Inp1 = Input1.toCharArray();
           char[] Inp2 = Input2.toCharArray();

           Arrays.sort(Inp1);
           Arrays.sort(Inp2);

           if (Arrays.equals(Inp1, Inp2)){
               return 1;
           }

           else {
               return 0;
           }

    }


}

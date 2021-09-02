/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class SimpleMath {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String stringA = input.next();

        System.out.println("What is the second number? ");
        String stringB = input.next();

        int a = Integer.valueOf(stringA);

        int b = Integer.valueOf(stringB);

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", a,b, a+b,a,b, a-b,a,b, a*b,a,b, a/b);
    }// End of method

}//End of class

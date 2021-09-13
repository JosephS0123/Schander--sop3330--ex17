/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;



import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {

        Scanner uInput = new Scanner(System.in);
        System.out.println( "Are you male or female? enter 1 for male and 2 for female" );
        byte MorF = uInput.nextByte();
        System.out.println("How many ounces of alcohol did you drink?");
        int Ounces = uInput.nextInt();
        System.out.println("What is your weight in pounds?");
        int Weight = uInput.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        int Hours = uInput.nextInt();
        double MorF2 = (MorF==1)?.73:.66;
        double BAC = (Ounces *5.14/Weight*MorF2)-.015 * Hours;
        System.out.println("Your BAC is "+BAC);
        if(BAC>.08){
            System.out.println("You are not legally allowed to drive");
        }
        else {
            System.out.println("You are legally allowed to drive");
        }

    }
}

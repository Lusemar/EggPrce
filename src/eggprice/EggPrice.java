/*
Name: Lusemar Oliveira
Class: COP2800 - Programming in Java 
Programming Assignment #1: Display Information
Due date: Tuesday, January 19, 2021
Program Description: This  program will display the Area and Perimeter of a rectangle. 
 */
package eggprice; // Here is the package where the program is located.

import java.util.Scanner;

public class EggPrice { // Here is the our class.
    public static void main(String[] args) { // Here is the main method, it's where the program executes.
        
        // Variables declared and intiialized. 
        final double PRICE_DOZEN = 3.25;  
        final double PRICE_UNIT = 0.45;
        final int DOZEN = 12;
        double totalPrice = 0;
        int eggs, looseEggs, numDozen = 0;
                        
        // User input
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the Amount of Eggs needed: ");
        
        // Mathematic Logical Operations.
        eggs = input.nextInt();
        numDozen = eggs / DOZEN;
        looseEggs = eggs % DOZEN;
        totalPrice = numDozen * PRICE_DOZEN + looseEggs * PRICE_UNIT; 
        
        // Total Information output.        
        System.out.println("You ordered " + eggs + " eggs. That's " + numDozen + " dozen at $" + PRICE_DOZEN + " per dozen and " + looseEggs + " loose eggs at $" + (int)(PRICE_UNIT * 100) + " cents each,  for a total of $" + totalPrice + "." );
    }
}

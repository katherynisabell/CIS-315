// A Java program to take double and string user inputs and do a caluclation to display an output

import java.util.Scanner;

// Main method

public class WageCalculator {
    public static void main(String args[]) {
        
// Set up the variables

        String name;
        double regularWages;
        double overtimeWages;
        double totalWages;
        
 
        
// Create a Scanner orject tp read input        

        Scanner input = new Scanner (System.in);

// Prompt user for inputs    

        System.out.print("What is your name?  ");        
        name = input.nextLine();
        System.out.print("How much is your regular wage? ");
        regularWages = input.nextDouble();
        System.out.print("How much is your overtime wage? ");
        overtimeWages = input.nextDouble();
        
        
        
// Calculation
        
        totalWages = regularWages + overtimeWages;
        
// Display the Result - using contatination

      System.out.println(); //Line Break
      System.out.println("Hello, "+ name );
      System.out.println("The total wage amount for you is: "+ totalWages );
        
    }
}
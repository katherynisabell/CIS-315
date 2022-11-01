/*  Name: Katheryn Grant   
    Student ID: 12345678 
    Email: kgrant@una.edu
    Course Information: <CS 315-03>
    Program Source File Name:  <BusincessCalc.java>
    Programming Assignment:  Project 2 
    Program Description: A program with a main method that has ONE loop that reads the user’s selection from  
    a menu of choices and continues to process each choice until the user selects to exit the program. This program uses write and call methods
    Due Date: 10/31/22
    
    In keeping with the honor code policies of the University of University of North Alabama, the 
    School of Business, and the Department of Computer Science, I affirm that I have neither 
    given nor received on this programming assignment. This assignment represents my individual, original effort.
   ... My Signature is on File.
         
*/ 

import java.util.Scanner;

public class BusinessCalc {
    // create new scanner
    static Scanner input = new Scanner(System.in);

    // offer choices and show menu
    //main method
    static int getChoice() {
        System.out.println("Main Menu: Business Calculator");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" + "\n");
        System.out.println("Please choose what you would like to calculate."  + "\n");
        System.out.println("1. Find the Net Income");
        System.out.println("2. Find the Profit Margin");
        System.out.println("3. Find the Current Ratio");
        System.out.println("4. Exit the Program");

        // get user's choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // return user choicce input from scanner
        return choice;
    }

    // method for choice 1
    static double netIncome(double revenue, double expenses) {
        return revenue - expenses;
    }

    // method for choice 2
    static double profitMargin(double net, double revenue) {
        return (net / revenue) * 100.0;
    }

    // method for choice 3
    static double currentRatio(double assets, double liabilities) {
        return assets / liabilities;
    }

    // second main method
    public static void main(String[] args) {
        int choice;
        
        //do while
        do {
            choice = getChoice();
            System.out.println();
            
            //if else
            if(choice == 1) {
                System.out.print("Enter the revenue: $ ");
                double revenue = input.nextDouble();
                System.out.print("Enter the expenses: $ ");
                double expenses = input.nextDouble();
                double net = netIncome(revenue, expenses);
                System.out.println("The Net Income: $ "+String.format("%.2f", net));
            }

            else if(choice == 2) {
                System.out.print("Enter the Net Income: $ ");
                double net = input.nextDouble();
                System.out.print("Enter the Revenue: $ ");
                double revenue = input.nextDouble();
                double profit = profitMargin(net, revenue);
                System.out.println("The Profit Margin is: $ " + profit + "%%");
            }

            else if(choice == 3) {
                System.out.print("Enter the Current Assests: $ ");
                double assets = input.nextDouble();
                System.out.print("Enter the Current Liabilities: $ ");
                double liabilities = input.nextDouble();
                double ratio = currentRatio(assets, liabilities);
                System.out.println("The Current Ratio is: $ "+ ratio);
            }

            
            else if(choice == 4) {
                System.out.println("Goodbye!");
                System.exit(0);
            }

            else {
                System.out.println("Invalid choice!");
            }

            System.out.println();
        }while(choice != 4);
    }
}
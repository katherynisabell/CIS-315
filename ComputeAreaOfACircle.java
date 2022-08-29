// A Java program to find the area of a circle

import java.util.Scanner;

public class ComputeAreaOfACircle {
    public static void main(String args[]) {
        // Set up the variables
        
        double radius;
        double area; 
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a value for the radius ");
        radius = input.nextDouble();
        
        
        //radius = 20;
        
        // Calculation
        
        area = 3.14159 * radius;
        
        // Display the Result

      System.out.println("The area of a circle with a radius "+ radius + " is " + area);
    }
}
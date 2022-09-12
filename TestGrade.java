// Using the if-else-if statement decision syntax to figure out the letter grade for a test 

import java.util.Scanner;


public class TestGrade {
    public static void main(String args[]) {
        int testScore; 
        
    // Create the scanner object    
    Scanner input = new Scanner(System.in);
    
    //Prompt user for input
    System.out.print("Enter your test grade: ");
    testScore = input.nextInt();
    
    //Define if-elese-if conditions
    
    if (testScore < 60 )
      System.out.println("Your grade is a F");
    else if (testScore < 70 )
    
      System.out.println("Your grade is a D");
    else if (testScore < 80 )      
    
      System.out.println("Your grade is a C");
    else if (testScore < 90)
    
      System.out.println("Your grade is a B");    
      
    else 
      System.out.println("Your grade is an A");        
    }
}
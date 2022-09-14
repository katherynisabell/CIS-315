// A program that displays the correct month based off the users input


// Import scanner
import java.util.Scanner;

public class DaysMonth{
    public static void main(String args[]) {
        
        int input; 

        
// Create a Scanner object 
        Scanner keyboard = new Scanner(System.in);
        
//Prompt for user input
        System.out.println("Enter a number 1 - 6");

        
        input = keyboard.nextInt(); 

//Defining decision process
        switch(input) {
            
            case 1:
                System.out.println("The month is January. ");
                break;
                

            case 2:      
                System.out.println("The month is February. ");
                break;
                

            case 3:      
                System.out.println("The month is March. ");
                break;
                
            case 4:      
                System.out.println("The month is April. ");
                break;
                
            case 5:      
                System.out.println("The month is May. ");
                break;      
                
            case 6:      
                System.out.println("The month is June. ");
                break;                
                
                default:
                System.out.println("Invalid Input.");                
//Class switch
            
        }
    }
}
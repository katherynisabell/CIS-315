// A program that displays the correct month based off the users input


// Import scanner
import java.util.Scanner;

public class DaysMonthExtra{
    public static void main(String args[]) {
        
        int input; 

        
// Create a Scanner object 
        Scanner keyboard = new Scanner(System.in);
        
//Prompt for user input
        System.out.println("Enter a number 1 through 6");

        
        input = keyboard.nextInt(); 

//Defining decision process

            if (input == 1){
                System.out.println("The month is January. ");
            }
                

            else if (input == 2){     
                System.out.println("The month is February. ");
            }

            else if (input == 3){      
                System.out.println("The month is March. ");
            }

            else if (input == 4){      
                System.out.println("The month is April. ");
            }

            else if (input == 5){      
                System.out.println("The month is May. ");
            }

            else if (input == 6){      
                System.out.println("The month is June. ");
            }

            else{
                System.out.println("Invalid Input.");
            
        }
    }
}
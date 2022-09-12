// To display the cost for the food grade selected by the user

// Grade A = 30 cents per pound
// Grade B = 20 cents per pound
// Grade C = 15 cents per pound

// Import scanner
import java.util.Scanner;

public class PetFoodGrade {
    public static void main(String args[]) {
        
        String input; 
        char foodGrade;
        
        // Create a Scanner object 
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt for user input
        System.out.println("The following pet food grades are avaliable,");
        System.out.println("A, B, C. Which do you want the price for? ");
        
        input = keyboard.nextLine(); //Ajhdsajkfh
        foodGrade = input.charAt(0);
        
        // Display the price for the selection
        
        switch(foodGrade) {
            
            case 'A':
            case 'a':      
                System.out.println("The cost per pound is 30 cents. ");
                break;
                

            case 'B':
            case 'b':      
                System.out.println("The cost per pound is 20 cents. ");
                break;
                

            case 'C':
            case 'c':      
                System.out.println("The cost per pound is 15 cents. ");
                break;
                
                
                default:
                System.out.println("Invalid Input.");                
            //class switch
            
        }
    }
}
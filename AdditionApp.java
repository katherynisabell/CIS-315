import java.util.Random;
import java.util.Scanner;

public class AdditionApp{
    public static void main(String args[]) {
        
        String again = "y";
        int num1;
        int num2;

        
        // Create scanner object to get input
        Scanner input = new Scanner(System.in);
        
        // Create a random object to generate random numbers
        Random rand = new Random();
        
        // Stimulate the roll of the dice
        
        System.out.println("Let's start the tutorial... You will be shown random numbers between 1 and 10 -- followed by the result of their addition. ");
        while(again.equalsIgnoreCase("y")){
            
            for (int i = 1; i<=4; i++){

            
            num1 = rand.nextInt(10) + 1 ;
            num2 = rand.nextInt(10) + 1 ;
            
            System.out.println("The numbers are: ");
            System.out.println(num1+ " " + num2);
            
            int sum = num1 + num2;
            
            System.out.println("The total is: " + sum);
            }
            
            System.out.println("Play the game again (y=yes) ?");
            
            again = input.nextLine();
        
        }
  }
}

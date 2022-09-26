import java.util.Random;
import java.util.Scanner;

public class RandomExample {
    public static void main(String args[]) {
        
        String again = "y";
        int die1;
        int die2;
        
        // Create scanner object to get input
        Scanner input = new Scanner(System.in);
        
        // Create a random object to generate random numbers
        Random rand = new Random();
        
        // Stimulate the roll of the dice
        while(again.equalsIgnoreCase("y")){
            System.out.println("Roll the dice...");
            
            die1 = rand.nextInt(6) + 1 ;
            die2 = rand.nextInt(6) + 1 ;
            
            System.out.println("The values for the die are ");
            System.out.println(die1 + " " + die2);
            System.out.println("Roll the dice again (y=yes) ?");
            again = input.nextLine();

    }
  }
}



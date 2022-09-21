import java.util.Scanner;

public class salesApp {
    public static void main(String args[]) {
        
    int dailyAmount;

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter today's sale amount: ");
    dailyAmount = input.nextInt();
    
    while(dailyAmount < 2000){
        System.out.println("The sales amount has not reached the minimum amount required for the week. Please enter an updated total tomorrow.");
        dailyAmount = input.nextInt();
    }
        //End While
        System.out.println(" The sales amount is very satisfactory! ");
            
         }
}
import java.util.Scanner;
public class Wages {
    public static void main(String args[]) {
    
        final int EMPLOYEES = 5;
        double rate;
        double pay;
        
        // Create an array to hold employee hours
        int[] hours = new int[EMPLOYEES];
        
        // Create scanner
        Scanner input = new Scanner (System.in);
        
        // Prompt and get user input for the number of hours
        System.out.println("Enter the hours worked by " + EMPLOYEES +" employees who earned the same hourly rate: ");
        
        for(int i=0; i<EMPLOYEES; i++){
            System.out.println("Employee #" + (i+1) + ":");
            hours[i] = input.nextInt();
        } // End for loop
        
        // Get the hourly pay rate
        System.out.println("Enter the hourly rate for each employee:");
        rate = input.nextInt();
        
        // Display the pay
        System.out.println("Here are the employees' salaries - ");
        
        for(int i=0; i<EMPLOYEES; i++){
            pay = hours[i] * rate; 
            System.out.println("Employee # " + (i+1) + ": $" + pay);
        }
    }
}
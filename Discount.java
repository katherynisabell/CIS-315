
// Write a java program to calculate the sale price of an item with a 20% discount



import java.util.Scanner;

public class Discount {
    public static void main(String args[]) {
        // Set up the variables
        
        double regularPrice;
        double discountAmt;
        double salePrice; 
        
        final double DISCOUNT = 0.2;
        

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the price of an item: $");
        regularPrice = input.nextDouble();
        
        

        // Calculate 20% 
        
        discountAmt = regularPrice * DISCOUNT;
        
        // Calcuate the sale price
        
        salePrice = regularPrice - discountAmt;
        
        // Display the Result

      System.out.println("A 20% discount of an $"+ regularPrice + " item is: $ " + salePrice);
    }
}
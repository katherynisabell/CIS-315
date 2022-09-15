//Name: Katheryn Grant   
//Student ID: L00684995 
//Email: kgrant@una.edu
//Course Information: <CIS 315-03>
//Program Source File Name:  <HelloWorld.java>
//Programming Assignment:  #1 
//Program Description: <brief description of the program>
//Due Date:9/15/22
 
//In keeping with the honor code policies of the University of University of North Alabama, the 
//School of Business, and the Department of Computer Science, I affirm that I have neither 
//given nor received on this programming assignment. This assignment
//represents my individual, original effort.
//... My Signature is on File.
         
*/ 


import java.util.*;
public class invoice
{
	public static void main(String[] args) {
	    
//print statement for header/top of the reciept
		System.out.println("AG-Sales Sales As A Service - INVOICE");
		System.out.println("----------------------------------");
		System.out.printf("Customer Name:");
		Scanner input = new Scanner(System.in);
		
//get user inputs and output as strings
		String customerName = input.next();
		System.out.printf("Customer Address:");
		String customerAddress = input.next();
		System.out.printf("Mode of Payment:");
		String modeofPayment = input.next();
		System.out.printf("Cost of sales Service: $");
		
//get user service cost
		float serviceCost = input.nextFloat();
		System.out.println("Service Fee:$ 2500.00");
		System.out.println("Tax Rate: 8.00%");
		
//calculate service cost and service fee
		serviceCost += (float)2500 ;
		
//calculate tax amount
		float tax = (float)0.08 * serviceCost;
		System.out.printf("Tax Amount: $ %.2f",tax);
		System.out.println();
		System.out.println("           ------------");
		
//calculate total cost
		float total_amt = serviceCost + tax;
		System.out.printf("Total Payment: $ %.2f",total_amt);
	}
}
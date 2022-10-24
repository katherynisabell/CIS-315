import java.util.Scanner;

public class Project2
{

public static Scanner scan = new Scanner(System.in); 

public static void main (String [] args)
{
int chooseOne; 

do
{
chooseOne = getChoice();
processChoice(chooseOne);

} while (chooseOne != 4);
}

// Get Choice from user

public static int getChoice()
{
System.out.println("Main Menu: Business Related Calculator");
System.out.println();
System.out.println("Choose what you would like to calculate.");
System.out.println();

//TASK #1 print the menu of choices
System.out.println("1. Find the Net Income");
System.out.println("2. Find the Profit Margin");
System.out.println("3. Find the Current Ratio ");
System.out.println("4. Exit the Program");

return scan.nextInt();
}



public static void processChoice(int chooseOne)
{
double value = 0; 
double revenue; 
double expenses; 
double income; 
double currentAssets; 
double currentLiabilities;

switch (chooseOne)
{
case 1:
System.out.print("Enter the total business revenue: ");
revenue = scan.nextDouble();
System.out.print("Enter the total expenses: ");
expenses = scan.nextDouble();

//Task 2
netIncome = revenue-expenses;

System.out.println("The net income is " + netIncome + "\n");
break;

case 2:
System.out.print("Enter the total net income: ");
length = scan.nextDouble();
System.out.print("Enter the total business revenue: ");
width = scan.nextDouble();


//Task 3
profitMargin = (netIncome/revenue) * 100;


System.out.println("The profit margin is: " + profitMargin + "\n");
break;

case 3:
System.out.print("Enter the amount of current assets: ");
currentAssets = scan.nextDouble();
System.out.print("Enter the amount of current liabilities: ");
currentLiabilities = scan.nextDouble();

//Task 4

currentRatio = currentAssets/currentLiabilities;

System.out.println("The current ratio is: " + currentRatio + "\n");
break;

case 4:
System.out.println("Goodbye");
break;
default:
System.out.println("You did not enter a valid choice.");
    }
        }
}




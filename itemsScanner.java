//Import new Scanner
import java.util.Scanner;
//Main statement
public class itemsScanner {
    public static void main(String args[]) {
//Declare Variables        
int items;
int totalNumber = 0;
//Invoke new scanner        
Scanner input = new Scanner(System.in);
System.out.println("Enter a value or -1 to stop");
items = input.nextInt();
//While Loop      
    while(items != -1){
        totalNumber += items;
        System.out.println("Enter a value or -1 to stop");
        items = input.nextInt();}//End While

      System.out.println("Total Number of items = " + totalNumber);
      }
}
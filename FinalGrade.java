import java.util.Scanner;
public class FinalGrade {
    public static void main(String args[]) {
        
      int scoreOne;
      int scoreTwo;
      int scoreThree;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your first test grade: ");
      scoreOne = input.nextInt();
 
      System.out.print("Enter your second test grade: ");
      scoreTwo = input.nextInt();     
      
      System.out.print("Enter your first test grade: ");
      scoreThree = input.nextInt();
      
      int calculateAverage = scoreOne + scoreTwo + scoreThree;
      
      int averageGrade = calculateAverage / 3;
      
      
      System.out.println("Average Grade:  " + averageGrade);
      finalGrade(averageGrade);
    }

    public static void finalGrade (int averageGrade){
        if (averageGrade < 60 ){
          System.out.println("Your grade is a F.");
        }
        
        else if (averageGrade < 70 ){
          System.out.println("Your grade is a D.");
        }
        
        else if (averageGrade < 80 ){ 
          System.out.println("Your grade is a C.");
        }
        
        else if (averageGrade < 90){
          System.out.println("Your grade is a B.");    
        }  
        
        else {
          System.out.println("Your grade is an A.");
        }
        
        }
    }
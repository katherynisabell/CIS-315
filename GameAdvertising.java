import java.util.Scanner;

public class GameAdvertising {
    public static void main(String args[]) {
        
        String gameName;
        int numDownloads;
        int rating; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name of your game: ");
        gameName = input.nextLine();
        
        System.out.print("Enter the total number of downloads: ");
        numDownloads = input.nextInt();
        
        System.out.print("Enter the average customer rating (5 = excellent, 1 = very bad): ");
        rating = input.nextInt();
        
        if (numDownloads >= 10000 || rating <= 3){
            advertise();}
        else{
            notAdvertise();}}
        
    public static void advertise()
    {
        System.out.println("Selected to advertise!");
    }
    
    public static void notAdvertise()
    {
        System.out.println("Will not be selected to advertise this month!");

    }
}
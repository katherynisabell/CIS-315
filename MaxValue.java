public class MaxValue {
    public static void main(String args[]) {
      int a = 10;
      int b = 25;
      
      int c = max(a,b);
      System.out.println("The maximum value is " + c);
      //end main
    }
      
      public static int max(int a, int b){
        int result; 
          
        if(a>b)
         result = a;
        else
         result = b;
            
        return result;
    }
}
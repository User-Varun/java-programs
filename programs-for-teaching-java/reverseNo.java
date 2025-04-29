import java.util.Scanner;


public class reverseNo {
    
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
      
        System.out.println("Enter a number to reverse");
        int n = scr.nextInt();
          
          
          scr.close();

          int rv = 0;
          int t;
    
          
          while (n != 0) {
              t = n % 10;
          
              rv = (rv * 10) + t;
              n = n / 10;
          }
        System.out.println("Reversed Number: "+ rv);
    }
}

/* 
13. Find the result of following (accept values for variables used in right side of expression)

a.    y = x*x + 3*x - 7 (print value of y)

b.    y = x++ + ++x (print value of x and y)

c.    z = x++ - --y - --x + x++ (print value of x, y, and z)

d.    z = x && y || !(x || y) (print value of z)

*/
import java.util.Scanner;

class program13{

public static void main(String args[]){
  
  System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");

  Scanner scan = new Scanner(System.in);
  
  System.out.print("Enter val. of X: ");
  int x = scan.nextInt();
  
  System.out.print("Enter val. of Y: ");
  int y = scan.nextInt();
  
  scan.close();
  
  // Ans of given expression
  y = x*x + 3*x - 7;
  System.out.println("result for y=x^2+3x-7 is: y= "+y);
  
   y = (x++) + (++x);
  System.out.println("result for y=x++ + ++x is: X= "+x+", and y= "+y);
  
  int z = (x++) - (--y) - (--x) + (x++);
  System.out.println("result for z=x++ - --y - --x + x++ is: x= "+x+", y= "+y+", and z= "+z);
  
  boolean z2 =  (x!=0 && y!=0 ) || !(x!= 0 || y!=0);
  System.out.println("result for x && y || !(x || y) is: z= "+z2);
  
}
 
}
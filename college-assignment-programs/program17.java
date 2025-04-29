
// check if entered year is leap year on not.

import java.util.Scanner;


class program17{
 public static void main(String args[]){
	System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
   
   Scanner scan = new Scanner(System.in);
   
   System.out.print("enter year: ");
   int year = scan.nextInt();
   
   scan.close();
   
  
   
   if((year % 4) == 0 && (year % 100) == 0 || (year % 400 == 0 )){
	   System.out.print(year+" is a Leap year");
	  
   }else{
	   System.out.print( year+" is not a leap year");
	 
   }
   
 }	 
}
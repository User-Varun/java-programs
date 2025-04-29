// calculate the sum of 5 subjects and find percentage;

import java.util.Scanner;

class program8{
 public static void main(String args[]){
   System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
   
   Scanner scr = new Scanner(System.in);
   
   int sum = 0;
   
   for(int i =1; i <= 5; i++){
	   System.out.println("enter subject "+ i+ " marks: ");
	   sum += scr.nextInt();
   }
   
   scr.close();
   
 
	
   
   System.out.println("Sum is: "+ sum);
   System.out.println("total percentage is: "+ (((double) sum/500)*100)); // 5 for five subjects
 }
}

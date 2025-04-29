// program to find simple interest

import java.util.Scanner;

class program9{
 
 public static void main(String args[]){
	System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
    
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter principal: ");
	int principal = scan.nextInt();
	System.out.println("enter rate in %: ");
    int rate = scan.nextInt();	
	System.out.println("enter time in years: ");
	int time = scan.nextInt();
	
	scan.close();
	
	System.out.println("your simple interest is: "+(principal * rate * time)/100 );
 }
}
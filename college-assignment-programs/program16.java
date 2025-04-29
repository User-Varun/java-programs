/*
 find the Greatest in 3 numbers

*/
import  java.util.Scanner;

class program16{
	public static void main(String args[]){
    System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
    
	Scanner scan = new Scanner(System.in);
	

   	System.out.print("enter num1: ");
	  int num1 = scan.nextInt();
	
	System.out.print("enter num2: ");
	  int num2 = scan.nextInt();
	  
	System.out.print("enter num3: ");
	  int num3 = scan.nextInt();
	
	scan.close();
	
	if(num1 > num2 && num1 > num3){
		System.out.print("num1 is greatest: "+num1);
	}else if(num2 > num1 && num2 > num3){
		System.out.print("num2 is greatest: "+num2);
	}else if(num3 > num1 && num3 > num2){
		System.out.print("num3 is greatest: "+num3);
	}else{
		System.out.print("All Num are equal");
	}
 		
}
}
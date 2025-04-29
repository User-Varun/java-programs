

/*
 accept person's age , gender(1 for male , 0 for female) , then check wheather the
 person is eligible for marriage for not.
 
 eligibility :-
 21 for male,
 18 for female
*/

import java.util.Scanner;

class program18{
	
	  public static void checkPersonForMarriage(int age , int gender){
		 
		 if(gender == 1 && age >= 21){
          System.out.print("you are allowed to marry.");			 
		 }else if(gender == 0 && age >= 18){
			 System.out.print("you are allowed to marry.");
		 }else{
			 System.out.print("you are not allowed to marry");
		 }
	 }
	
	public static void main(String args[]){
	 System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");

    Scanner scan = new Scanner(System.in);
	
	System.out.print("enter age: ");
	int age = scan.nextInt();
	
		System.out.print("enter gender (1 for male, 0 for female): ");
	int gender = scan.nextInt();

    scan.close();
	
	checkPersonForMarriage(age , gender);
      
    
	}
}
// print year , month , day of given days 

import java.util.Scanner;

class program10{
	public static void main(String args[]){
	
	System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
    
	Scanner scan = new Scanner(System.in);
	
	System.out.print("enter no. of Days: ");
	int days = scan.nextInt();
	
	scan.close();
	
	double  years = ( (double)  days/365);
	double months =  ( (double) days/12);
	
	
	System.out.print("there are "+years+(years > 1?" years, ":" year, ")+(days/12)+(months > 1? " months, ": " month ")+ "in "+(days)+(days > 1? " days ": " day "));
	 
	}
}
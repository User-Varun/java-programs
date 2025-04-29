// program to find area and cicumference of a circle

import java.util.Scanner;

class program7{
	public static void main(String args[] ){
		System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("enter your radius: ");
		int radius = scr.nextInt();
		
		scr.close();
		
		
		double pi = 3.14;
		
	
	 
	
		System.out.println("Area of circle of raduis 5 is: "+(pi* radius * radius));
		System.out.println("circumference of circle of raduis 5 is : "+(2*pi*radius));
	}
}

// convert temperature from farenhite to celcius 

import java.util.Scanner;

class program11{
	public static void main(String args[]){
		System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter temperature in farenhite: ");
		int tempF = scan.nextInt();
		
		scan.close();
		
		double tempC = 5*( tempF - 32 )/9.0;
		
		System.out.println("Temp in Celcius: "+tempC);
	}
}
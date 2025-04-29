/*
15. In a company, an employee is paid as under:

If his basic salary is less than Rs. 1500, then:
 HRA = 10% of basic salary
 DA = 90% of basic salary

If his basic salary is equal to or above Rs. 1500, then:
 HRA = Rs. 500
 DA = 98% of basic salary

If the employee's salary is input by the user, write a program to find his gross salary.

Formula:
GS = Basic + DA + HRA

*/
import  java.util.Scanner;

class program15{
	public static void main(String args[]){
    System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");
    
	Scanner scan = new Scanner(System.in);
	
	System.out.print("enter basic salary: ");
	int bs = scan.nextInt();
	
	scan.close();
	
	// question logic
	int DA = 0 , HRA = 0 , GS;
	
	if(bs < 1500){
		HRA  = (bs/100)*10;
		DA  = (bs/100)*90;
	}else if(bs >= 1500){
		HRA = 500;
		DA = (bs/100) * 98;
	}
	
	GS = bs + DA + HRA;
	
	System.out.println("Gross Salary is: "+GS);
	
}
}
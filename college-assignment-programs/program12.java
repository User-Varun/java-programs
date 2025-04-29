
// swap two no. without using 3rd varibale ( using arithmatic method , the method so cool ) 
import java.util.Scanner;

class program12{
 public static void main(String args[]){
 		System.out.println("Name : Varun pawar , enrollment no. : 0873CS231133" + "\n");

    Scanner scan = new Scanner(System.in);
	
	System.out.print("enter 1st no.: ");
	int n1 = scan.nextInt();
	
	System.out.print("enter 2nd no.: ");
	int n2 = scan.nextInt();
	
	scan.close();
	
	
	System.out.println("before swap: "+n1+" and "+n2);
	
	n1 = n1 + n2;
	n2 = n1 - n2;
	n1 = n1 - n2;
	
	System.out.println("after swap: "+n1+" and "+n2);
	
 }
 
}
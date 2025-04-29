import java.io.*;

// this program do what the scanner(for console input) method does
class ReturnConsoleInput{
	public static void main(String args[]){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
		  int x = Integer.parseInt(	br.readLine());
		  int y = Integer.parseInt(br.readLine());
          System.out.println(x+y);		  
		}catch(Exception tt){
			System.out.println(tt);
		}
	}
	
}
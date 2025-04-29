import java.io.*;

class ConsoleToFileWriter{
	public static void main(String args[]){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String s1 = br.readLine();
			FileWriter fw = new FileWriter("chat.txt");
			
			while(!s1.equals("quit")){
				fw.write(s1);
				fw.flush();
				s1 = br.readLine();
				
			}
		
		   
		
		}catch(Exception tt){
			System.out.println(tt);
		}
	}
	
}

/*
java math  methods 

max : retun max from two param
min : retun min from two param
sin,cos , tan,  asin , acos , atan, pow , random , floor, ceil, round, sqrt, : 

*/
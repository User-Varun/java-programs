import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class LstDemo 
{
	public static void main(String[] args) 
	{
		// list is a interface 
		
		// the <String > syntax means , generic set karna , means only string can be included in lt obj;
		List <String> lt = new ArrayList<>();
		
		lt.add("kunal");
		lt.add("dhamal");
		lt.add("anuj");
		lt.add("indore");
		lt.add("zoo");
		lt.add("babla");
		
		for(String s : lt ){
		  System.out.println(s);	
		}
		System.out.println();
		
		Collections.sort(lt);
		
		System.out.println("Sorted Data");
		for(String s : lt ){
		  System.out.println(s);	
		}
		
		

	}
}

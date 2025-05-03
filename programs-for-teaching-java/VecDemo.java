import java.util.Vector;

class VecDemo 
{
	public static void main(String[] args) 
	{   
		// vector only store object not primitive val
		Vector v1 = new Vector();
		
		System.out.println("Capacity= "+v1.capacity());
		
		

		for(int i = 1; i <= 10; i++){
		  v1.add(i); // i will store in a object of integer class	
		}
		
		System.out.println("Values= "+v1);
		System.out.println("Capacity= "+v1.capacity());
		v1.add("HELLO INDORE");
		System.out.println("Values= "+v1);
		System.out.println("Capacity= "+v1.capacity());
		
	}
}

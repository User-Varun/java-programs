/* 
InterView Question :-
what is datatype or data serialization ? :- to store data from temp memory to permanent memory
what is object serialization ? :- we need marker interface to implement this.

A interface without a method is called a marker interface.

the marker interface is to be used by JRE ( java runtime interface ) inorder to write( see in code ) ;



*/

import java.io.*;
class ObjDemo implements Serializable{


	  
  int x=0 , y =0;
  boolean b = false;
  public static void  main(String args[]){
	try{ 
     ObjDemo d1 = new ObjDemo();
	 d1.x = 9090;
	 d1.y = 2323;
	 d1.b = true;
	 
	 FileOutputStream fos = new FileOutputStream("obj.txt");
	 
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 
	 oos.writeObject(d1);
	 oos.flush();
	 
	 FileInputStream fis = new FileInputStream("obj.txt");
	 ObjectInputStream ois = new ObjectInputStream(fis);
	 
	 ObjDemo t1 = (ObjDemo) ois.readObject();
	 
	 System.out.println(t1.x);
	 System.out.println(t1.y);
		System.out.println(t1.b);

  }catch(Exception tt){
	
	System.out.println(tt);
  }	  
  }
  
}

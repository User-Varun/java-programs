import java.io.*;

class DataTypeReadWriteDemo{
 public static void main(String args[]){
  int x = 9000 , y = 1212;
  float f = 666.777f;
  
  try{
     FileOutputStream fos = new FileOutputStream("data.txt");
	 
	 DataOutputStream dos = new DataOutputStream(fos);
	 
	 dos.writeInt(x);
	 dos.writeInt(y);
	 dos.writeFloat(f);
	 
	 FileInputStream fis = new FileInputStream("data.txt");
	 
	 DataInputStream dis = new DataInputStream(fis);
	 
	 int a = dis.readInt();
	 int b = dis.readInt();
	 float t = dis.readFloat();
	 
	 System.out.println("A= "+a);
	 	 System.out.println("b= "+b);
		 	 System.out.println("t= "+t);
  
  }catch(Exception tt){
   System.out.println(tt);
  }
 }
}


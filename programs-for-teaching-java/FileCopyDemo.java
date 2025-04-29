import java.io.*;

class FileCopyDemo{

 public static void main(String args[]){
  try{
  FileInputStream fis = new FileInputStream("filename");
  
  
  File ff = new File("file name");
  int x = (int)ff.length();
  byte b[] =  new byte[x];
  fis.read(b);
  
  FileOutputStream fos = new FileOutputStream("DemoTest.java");
  fos.write(b);
  
  String s1 = new String(b);
  System.out.println(s1);
  
  fis.close();
  fos.close();
  }catch(Exception tt){
  System.out.println(tt);
  }
 }
}
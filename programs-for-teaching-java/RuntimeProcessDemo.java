class RuntimeProcessDemo{

public static void main(String args[]){
 
 // static method of Runtime object
 Runtime r1=Runtime.getRuntime();
 
 try{
	 
 Process p1 = r1.exec("mspaint.exe");
 Thread.sleep(5000);
 

 }catch(Exception tt){
	 System.out.print("error");
 }
 System.out.println("Hello world");
}

}
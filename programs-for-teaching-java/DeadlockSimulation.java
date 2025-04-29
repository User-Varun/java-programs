class ABC{
 
 XYZ x1;
 synchronized void m1(){
  System.out.print("calling m1");
  x1.m4();
 };
 
  synchronized void m2(){
   System.out.print("calling m2");
 };
};
class XYZ {
  ABC a1;
 synchronized void m3(){
   System.out.print("calling m3");
   a1.m2();
 };
 
 synchronized void m4(){
  System.out.print("calling m4");
};

};


class Th1 extends Thread{
 ABC a2;
public void run(){
 while(true){
	 a2.m1();
 }
}	
};	

class Th2 extends Thread{
 XYZ x2;
public void run(){
 while(true){
	 x2.m3();
 }
}	;
}	;
  
class DeadlockSimulation{
 public static void main(String args[]){
   
   ABC ab = new ABC();
   XYZ xy = new XYZ();
   Th1 t1 = new Th1();
   Th2 t2 = new Th2();
   
   ab.x1 = xy;
   xy.a1 = ab;
   
   t1.a2 = ab;
   t2.x2 = xy;
   
   t1.start();
   t2.start();
   
 };

} 
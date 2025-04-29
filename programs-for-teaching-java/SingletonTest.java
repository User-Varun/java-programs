

class SingletonTest{
 public static void main(String args[]){
    Singleton t1 = Singleton.getObj();
	System.out.println(t1.x);
	Singleton t2 = Singleton.getObj();
	t2.x = t2.x+9000;
	System.out.println(t2.x);
	Singleton t3 = Singleton.getObj();
	t3.x = t3.x + 9000;
   System.out.println(t3.x);	
 }
}
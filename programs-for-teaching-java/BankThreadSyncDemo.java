class Bank{
	int bal=0;
	synchronized void depo(){
		if(bal <100){
			bal = bal+10;
		}else{
			try{
				notifyAll();
				wait();
				Thread.sleep(50);
			}catch(Exception tt){
				System.out.println(tt);
			}
		}
	}
	
	synchronized void with(){
		 if(bal > 10){
	   bal = bal-10;
    }else{
	   try{
		   notifyAll();
		   wait();
		   Thread.sleep(50);
	   }catch(Exception tt){
	   System.out.println(tt);
	   }
	}  
}

}




class Th1 extends Thread{
	Bank b1;
	 public void run(){
		 while(true){
			 b1.depo();
		 System.out.println(b1.bal);
		 }
	 }
}


class Th2 extends Thread{
	Bank b2;
	 public void run(){
		 while(true){
			 b2.with();
		 System.out.println(b2.bal);
		 }
	 }
}	 
	 
	 
class BankThreadSyncDemo{
    public static void main(String args[]){
		Bank bk = new Bank();
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		t1.b1 = bk;
		t2.b2 = bk;
		
		t1.start();
		t2.start();
		
		
	}
}	 
	 
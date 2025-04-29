class FinalParameterExample{
  
  
  
  void m1(final int x){
	  
	  System.out.println("x= "+x);
  }
  
  public static void main(String args[]){
	  FinalParameterExample d1 = new FinalParameterExample();
	  
	  for(int i = 1; i<=10; i++){
		   d1.m1(i);
	  }
	 
  }
}
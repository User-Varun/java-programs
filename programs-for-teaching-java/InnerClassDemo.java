class Demo{
void m1(){
System.out.println("hello indore");
}
  
  static class DD{
    void m2(){
	 System.out.println("hi india");
	}
   }
   
   
}


class InnerClassDemo{
  public static void main(String args[]){
   Demo d1 = new Demo();
   
   // if static inner class
   Demo.DD d4 = new Demo.DD();
   //d4.m2();
   

   // if inner class not static;
  // Demo.DD d3 = new Demo().new DD();
  // d3.m2();
  // d3.m1();
   
   


  }
}
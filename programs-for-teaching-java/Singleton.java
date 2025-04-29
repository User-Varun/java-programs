class Singleton{
  int x=0;
  static Singleton d1=null;
  private Singleton(){}
  public static Singleton getObj(){
   if(d1 == null){
     d1 = new Singleton();
	 d1.x = 9000;
   }
   return d1;
  }
}
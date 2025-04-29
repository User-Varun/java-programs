class RandomIntArrayNumGenerator{
 public static void main(String args[]){
   int a[] = new int[15];
   int i;
   
   for(i =0; i< 15; i++){
    a[i] = (int) (Math.random()*50);
	System.out.println(a[i]);
	
   }
 }
}
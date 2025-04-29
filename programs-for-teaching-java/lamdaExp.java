
/*
usage of lamda expression , conditions :-

1. interface should only contain one method that should be abstract


*/

interface Demo {
    void sales();
}

public class lamdaExp {
 
    public static void main(String args[]) {
        
        Demo d1 = ()->{
           System.out.print("hello indore");

        };
      d1.sales();
    }
}

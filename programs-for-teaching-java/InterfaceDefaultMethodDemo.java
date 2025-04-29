/*Method 2 of using interface 
 
interface Demo {
    void sales();
    void stocks();
}

class interfaceDemo {
    
    public static void main(String args[]) {
        Demo d1 = new Demo(){
            
        public void sales() {
        System.out.print("sales");
    }
    
    public void stocks() {
        System.out.print("stock");
    }
    
};

d1.sales();

}
}

*/

/* *********Method 1 of using interface**********
*/

interface Demo {
    // only can do this after jdk-8
    default void sales(){
        System.out.print("sales");
    };
    default void stocks(){
        System.out.print("stock");
    };
}

public class InterfaceDefaultMethodDemo implements Demo{
    // public void sales() 
    
    // public void stocks() 
    
    public static void main(String args[]) {
        InterfaceDefaultMethodDemo d1 = new InterfaceDefaultMethodDemo();
        
        d1.sales();
        d1.stocks();
    }
    
}

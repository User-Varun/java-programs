public class errorHandlingDemo {
    public static void main(String args[]) {
        
        System.out.print(
                "We do error handling using try , catch , finally  , also there are concept of throw and throws");

        try {
            // here comes the code , where the exception could occur
            
            System.out.print("try code working...");
                    
        } catch (Exception e) {

                    // here comes the exception 
                    System.out.println(e);
                } finally {
                    System.out.print("this is finally , will run everytime code get's here");
                }
    }
}

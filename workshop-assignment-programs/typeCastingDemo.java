public class typeCastingDemo {
    public static void main(String args[]) {
        
        int originalVar = 5;

        System.out.println("orginal var= "+originalVar);

        float typeCastedVar = (float) originalVar;

        System.out.println("type casted var (float)= "+typeCastedVar);


        System.out.println("String works differently in java , can't convert int to string");
    }
}

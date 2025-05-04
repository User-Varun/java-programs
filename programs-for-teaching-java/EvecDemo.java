import java.util.Enumeration;
import java.util.Vector;

class EvecDemo{


    public static void main(String args[]){
        Vector v1 = new Vector();

        for(int i = 0; i <=10; i++){
            v1.addElement(i);
        }
        System.out.println(v1);

        Enumeration e = v1.elements();

        while (e.hasMoreElements()) {

            Integer i = (Integer) e.nextElement();
            System.out.println(i);
        }
        System.out.println(v1);
    }

}
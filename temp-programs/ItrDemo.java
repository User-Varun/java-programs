
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ItrDemo {
    public static void main(String args[]) {
        List<Integer> lst = new LinkedList<Integer>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);

        Iterator<Integer> it = lst.iterator();

        while (it.hasNext()) {
            Integer t = (Integer) it.next();
            System.out.println(t);

            if (t == 5) {

                it.remove();

            }
        }
        
        System.out.println(lst);
    }
}

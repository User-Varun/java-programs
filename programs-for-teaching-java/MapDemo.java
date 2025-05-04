
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("raj", 7000);
        m.put("suraj", 9000); // key & values
        System.out.println(m);

        Set s = m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);

    }
}

// Question for monday!

// what is the difference between compareable and compareator;

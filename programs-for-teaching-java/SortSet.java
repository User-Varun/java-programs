
import java.util.SortedSet;
import java.util.TreeSet;

public class SortSet {
    public static void main(String args[]) {
        
        SortedSet h1 = new TreeSet(); // SortedSet
        h1.add(101);
        h1.add(102);
        h1.add(103);
        h1.add(104);
        h1.add(105);
        h1.add(106);
        h1.add(107);
        h1.add(108);
        h1.add(109);

        // System.out.println(h1.add("Z")); // False

        System.out.println(h1);
        System.out.println(h1.first()); // 101
        System.out.println(h1.last()); // 109
        System.out.println(h1.headSet(105)); // 101 to 104
        System.out.println(h1.tailSet(106)); // 106 to 109
        System.out.println(h1.subSet(101 , 105)); // 101 to 104

        
    }
}

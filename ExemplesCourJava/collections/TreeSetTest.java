import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> tree = new TreeSet<String>();
        tree.add("Aissam");
        tree.add("Mouad");
        tree.add("Saif");
        tree.add("Bahae");
        tree.add("Ayoub");
        Iterator<String> it = tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
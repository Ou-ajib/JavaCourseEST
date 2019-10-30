import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println((String)it.next());

        it = list.iterator();
        int i = 0;
        while(it.hasNext()){
            // String str = (String)it.next();
            // if(str.equals("4") || str.equals("2")) it.remove();
            it.next();
            it.remove();
            System.out.println("L'element N " + ++i + " Suprimme");
            
        }

        it = list.iterator();
        while(it.hasNext())
            System.out.println((String)it.next());
    }
}
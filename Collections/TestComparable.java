import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class TestComparable {
    public static void main(String[] args){
        List<ComparableTest> cdList = new ArrayList<ComparableTest>();
        ComparableTest cd1 = new ComparableTest("Ourahou", "Hassae", 10.0);
        ComparableTest cd2 = new ComparableTest("Ridae", "Candide", 25.0);
        ComparableTest cd3 = new ComparableTest("Moujib", "La boite", 13.0);
        ComparableTest cd4 = new ComparableTest("James", "Kra", 78.0);

        cdList.add(cd1);
        cdList.add(cd2);
        cdList.add(cd3);
        cdList.add(cd4);
        
        System.out.println("Avant le tri ");

        Iterator<ComparableTest> it = cdList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        Collections.sort(cdList);
        System.out.println("Apres le tri");
        it = cdList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
import java.util.*;

public class MapTest{
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "un");
        map.put(2, "deux");
        map.put(3, "trois");
        map.put(4, "quatre");
    
        System.out.println(map);
        Set<Entry<Integer, String>> setEntry = map.entrySet();
        Iterator<Entry<Integer, String>> itEntry = setEntry.iterator();
        System.out.println("Parcours d'une map avec setEntry : ");
        while(itEntry.hasNext()){
            System.out.println(itEntry.next());
        }

    }


}
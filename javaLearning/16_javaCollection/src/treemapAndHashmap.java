import java.util.*;
import java.util.Map.*;

public class treemapAndHashmap {
    public static void main(String[] args) {

        // ---------> We can use any one depending upon our requirement

        // Tree Map ---> Sorted

        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C"));

        tm.put(4,"D");
        tm.put(6,"E");

        // If no value is present then it will return next nearest value
        System.out.println(tm.ceilingEntry(5).getValue());

        System.out.println(tm.ceilingEntry(3).getValue());

        System.out.println(tm.get(4));

        // entry present in util.Map.*
        Entry<Integer,String> e = tm.firstEntry();

        System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(tm);


        // Hash Map -----> Unsorted

        HashMap<Integer,String> hm = new HashMap<>(Map.of(1,"A",2,"B",3,"C"));

        hm.put(4,"D");
        hm.put(6,"E");

        System.out.println(hm.get(4));


        // ----> Entry will not work in hash map because it is not sorted in
//        Entry<Integer,String> e = tm.firstEntry();
//
//        System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(hm);
    }
}

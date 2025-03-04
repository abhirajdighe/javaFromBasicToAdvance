import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        //  --> use to Store key value pair
        //  --> Preserve the order of insertion / Maintain the order of insertion
        //  --> along with hashtable it also contains next and prev to store the links

        //  --> Linked hashmap as cache

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true); // it is initial size not final/fix size it can be increased

        lhm.put(1,"A");
        lhm.put(2,"A");
        lhm.put(3,"A");
        lhm.put(9,"A");
        lhm.put(8,"A");
        lhm.put(6,"A");
        lhm.put(7,"A");

        // --> after below statements there will be change in access order and print of lhm will be according to its access
        String s = lhm.get(3);
        s = lhm.get(9);
        s = lhm.get(2);

        lhm.forEach((k,v)-> System.out.println(k + " " + v));

    }
}

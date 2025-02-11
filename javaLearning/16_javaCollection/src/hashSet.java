import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {

        HashSet hs = new HashSet(20,0.75f); // Initially hashset loading factor will be 0.75
        // loading factor should be in bwt 0-1;

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);
        System.out.println(hs.size());
    }
}

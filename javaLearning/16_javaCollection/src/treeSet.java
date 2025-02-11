import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(List.of(10,20,30,40));

        System.out.println(t);
        System.out.println(t.ceiling(32));
    }
}

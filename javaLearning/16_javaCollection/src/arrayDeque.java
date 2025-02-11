import java.util.*;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addLast(10); // it may throw exception
        dq.offerLast(11); // it will not throw exception

//        dq.forEach((x)-> System.out.println(x + " "));
        System.out.println(dq);

        dq.addFirst(9);
        dq.offerFirst(8);

//        dq.forEach((x)-> System.out.println(x + " "));

        System.out.println(dq);

    }
}

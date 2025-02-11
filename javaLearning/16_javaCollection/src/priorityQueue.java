import java.util.*;

// Class for max Heap
class MyComp implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2){
        if(o1>o2) return -1;
        if(o1<o2) return 1;
        return 0;
    }
}


public class priorityQueue {
    public static void main(String[] args) {
        // It represents as heap
        // it is implemented using array

        PriorityQueue<Integer> p = new PriorityQueue<>(); // It will be min Heap
        PriorityQueue<Integer> maxHeapPq = new PriorityQueue<>(new MyComp()); // It will be max Heap

        p.add(20);
        p.add(10);
        p.add(5);

        System.out.println(p);
        System.out.println(p.contains(20));
        System.out.println(p.peek());
    }
}

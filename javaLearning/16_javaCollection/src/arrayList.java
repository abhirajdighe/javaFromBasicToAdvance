import  java.util.*;

public class arrayList {
    public static void main(String[] args){
        // Initilizing array list
        ArrayList<Integer> arl1 = new ArrayList<>(20);

        // Initializing array list with inbuild elements
        ArrayList<Integer> arl2 = new ArrayList<>(List.of(10,20,30));

        arl1.add(9); // adding elements
        arl1.add(8);
        arl1.addAll(1,arl2); // adding collection into collection

        System.out.println(arl1);

        System.out.println(arl1.contains(30)); // Contains methods
        System.out.println(arl1.get(4)); // Get method
        System.out.println(arl1.indexOf(30)); // indexOf method


        // Iteration in arrayList

        for(int i =0;i<arl1.size();i++){
            System.out.print(arl1.get(i) + " ");
        }
        System.out.println("");
        for(Integer x:arl1){
            System.out.print(x+" ");
        }

    }
}

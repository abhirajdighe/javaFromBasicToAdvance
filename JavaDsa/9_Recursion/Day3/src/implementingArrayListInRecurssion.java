import java.util.ArrayList;

public class implementingArrayListInRecurssion {
    // first approach
    static ArrayList<Integer> list = new ArrayList<>();

    public static void linearSearch(int[] arr,int t,int i){
        if(i == arr.length){
            return ;
        }

        if(arr[i]== t){
             list.add(i);
        }
        linearSearch(arr,t,i+1);
    }

    // Second Approach

    public static ArrayList linearSearch2(int[] arr, int t, int i,ArrayList<Integer> list){

        if(i == arr.length){
            return list;
        }

        if(arr[i] == t){
            list.add(i);
        }

        return linearSearch2(arr,t,i+1,list);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};

        int t = 4;

        ArrayList<Integer> list1 = new ArrayList<>();

        linearSearch(arr,t,0);

        System.out.println(list);
        ArrayList<Integer> ans = linearSearch2(arr,t,0,list1);
        System.out.println(ans);
    }
}

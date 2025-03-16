import java.util.ArrayList;

public class arrayListInTheBody {

    public static ArrayList linearSearch2(int[] arr, int t, int i){
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }

        // This will have answer of that function call only
        if(arr[i] == t){
            list.add(i);
        }

        ArrayList<Integer> answerFromBelowCalls =  linearSearch2(arr,t,i+1);

        // To add all elements from another *ArrayList*  use  *addAll*
        list.addAll(answerFromBelowCalls);

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};

        int t = 4;

        ArrayList<Integer> ans = linearSearch2(arr,t,0);
        System.out.println(ans);
    }
}

public class recurssiveLinearSearch {

    public static boolean linearSearch(int[] arr,int t,int i){
        if(i == arr.length){
            return false;
        }

        return arr[i] == t || linearSearch(arr,t,i+1);
    }

    public static int linearSearchIndex(int[] arr,int t,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i]== t){
            return i;
        }
        else{
            return linearSearchIndex(arr,t,i+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int t = 4;

        System.out.println(linearSearch(arr,t,0));
        System.out.println(linearSearchIndex(arr,t,0));
    }
}

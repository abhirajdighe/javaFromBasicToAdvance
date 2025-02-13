public class reverseArrayFromgivenPoint {

    public static void reverseArray(int arr[], int k , int n){
        int s =0;
        int e =k;

        if(s>=e || k>=n-1){
            return;
        }

        while(s<=e){
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        reverseArray(arr,k,n);

        for(int x:arr){
            System.out.print(x+ " ");
        }
    }

}

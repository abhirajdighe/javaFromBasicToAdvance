public class bubbleSort {
    public static void main(String[] args){
        int arr[] = {5,4,2,3,1};
        int n = arr.length;
        // bubble sort code
        for(int i =0 ;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

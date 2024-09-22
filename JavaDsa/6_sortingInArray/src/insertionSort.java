public class insertionSort {
    public static void main(String[] args){
        int arr[] = {5,9,8,2,1};

        // Insertion sort
        for(int i =0;i<arr.length;i++){
            int currElement = arr[i];
            int j = i-1;
            while(j>=0 && currElement<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currElement;
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

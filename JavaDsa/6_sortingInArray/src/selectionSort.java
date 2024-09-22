public class selectionSort {
    public static void main(String[] args){
        int arr[] = {5,4,8,2,1};

        // Selection sort
        for(int i =0;i<arr.length;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

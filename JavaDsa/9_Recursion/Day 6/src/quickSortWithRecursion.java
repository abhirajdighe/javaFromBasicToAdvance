public class quickSortWithRecursion {

    public static void quickSort(int[] arr, int s,int e){
        // base case
        if(s>=e){
            return;
        }

        // Make Partition
        int p = partition(arr,s,e);

        // Sort left part
        quickSort(arr,s,p-1);

        // Sort right part
        quickSort(arr,p+1,e);
    }

    public static int partition(int arr[],int s,int e){
        int pivot = arr[s];
        int cnt =0;

        for(int i=s+1;i<e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }

        // Place pivot ar correct position
        int pivotIndex = s+cnt;

        // Swapping element

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[s];
        arr[s]= temp;

        // Now focus on left and right part
        int i =s,j =e;

        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j]= tmp;
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,6,9};
        int n = arr.length;

        quickSort(arr,0,n-1);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

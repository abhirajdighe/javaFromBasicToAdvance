public class searchInRotatedSortedArray {
    
    static int getPivot(int[] arr){
        int s =0;
        int e = arr.length-1;
        int mid;

        while(s<=e){

            mid = s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }

            else{
                e = mid -1;
            }

        }
        return s;
    }

    static int binarySearch(int arr[], int start ,int end,int key){
        int s = start;
        int e = end;
        int mid= s+(e-s)/2;

        while(s<=e){
            if(arr[mid] == key){
                return mid;
            }

            if(key>= arr[mid]){
                s = mid+1;
            }
            else{
                e = mid -1;
            }
        }
        return -1;
    }

    static int searchInArray(int[] arr, int key) {
        // Complete this function
        int n = arr.length;
        int pivot = getPivot(arr);
        if(key>=arr[pivot] && key <= arr[n-1]){
            return binarySearch(arr,pivot,n-1,key);
        }
        else{
            return binarySearch(arr,0,pivot-1,key);
        }
    }

    public static void main(String [] args){
        int[] arr ={7,8,9,1,2,3,4};
        int key = 3;
        int ans = searchInArray(arr,key);
        System.out.print("Element index is at: "+ ans);
    }
}

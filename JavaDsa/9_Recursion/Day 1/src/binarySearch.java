public class binarySearch {
    public static int recursiveBinarySearch(int arr[],int target,int s, int e){

        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid]>target){
            return recursiveBinarySearch(arr,target,s,mid-1);
        }

        return recursiveBinarySearch(arr,target,mid+1,e);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5;
        int s = 0;
        int e = arr.length-1;

        System.out.println(recursiveBinarySearch(arr,target,s,e));
    }
}

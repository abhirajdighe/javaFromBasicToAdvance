public class firstAndLastOccurence {
    static int firstOccurence(int[] nums, int target,int n){
        int s =0;
        int e = n-1;
        int first = -1;


        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid] == target){
                first = mid;
                e = mid-1;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else{
                e= mid-1;
            }
        }

        return first;
    }

    static int lastOccurence(int []nums,int target,int n){
        int s =0;
        int e = n-1;
        int last = -1;

        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid] == target){
                last = mid;
                s = mid+1;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else{
                e= mid-1;
            }
        }

        return last;
    }
    public static void main(){
        int arr[]={1,2,3,3,3,4};
        int first = firstOccurence(arr,3,6);
        int second = lastOccurence(arr,3,6);

        System.out.printf("First and last occurence of element is : %d %d\n",first,second);
    }
}

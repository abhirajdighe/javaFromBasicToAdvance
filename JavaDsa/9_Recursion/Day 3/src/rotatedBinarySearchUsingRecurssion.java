public class rotatedBinarySearchUsingRecurssion {

    public static int binarySearch(int [] arr,int t,int s,int e){
        if(s>e){
            return -1;
        }

        int m = s +(e-s)/2;

        if(arr[m] == t){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(t>= arr[s] && t<=arr[m]){
                return binarySearch(arr,t,s,m-1);
            }
            else{
                return  binarySearch(arr,t,m+1,e);
            }
        }

        if (t>=arr[m] && t<= arr[e]){
            return binarySearch(arr,t,m+1,e);
        }

        return binarySearch(arr,t,s,m-1);
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,2,3,4};

        int t = 11;

        System.out.println(binarySearch(arr,t,0,arr.length-1));
    }
}

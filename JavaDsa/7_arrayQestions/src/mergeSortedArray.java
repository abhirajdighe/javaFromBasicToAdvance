public class mergeSortedArray {

    public static void mergeArray(int arr[], int brr[], int n,int m,int ans[]){

        int arrayIndex = 0;
        int i =0;
        int j = 0;

        while(i<n && j<m){
            if(arr[i] <= brr[j]){
                ans[arrayIndex++] = arr[i++];
            }
            else {
                ans[arrayIndex++] = brr[j++];
            }
        }

        while(i < n){
            ans[arrayIndex++] = arr[i++];
        }

        while(j < m){
            ans[arrayIndex++] = brr[j++];
        }

        for(int x:ans){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int brr[] = {0,2,4,6,8,9,10};
        int n =arr.length;
        int m = brr.length;
        int ans[] = new int[n+m];
        mergeArray(arr,brr,n, m,ans);

    }
}

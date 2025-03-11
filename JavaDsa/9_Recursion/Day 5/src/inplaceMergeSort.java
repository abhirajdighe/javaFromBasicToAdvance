import java.util.Arrays;

public class inplaceMergeSort {

    public static void mergeSort(int[] arr,int s,int e){
        if(e-s <= 1){
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSort(  arr, 0, mid);
        mergeSort(arr, mid, e);

        mergeInplace(arr,s,mid,e);
    }

    public static void mergeInplace(int[] arr,int s,int m,int e){
        int[] mix = new int[e-s];

        int i =s;
        int j =m;
        int k= 0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k++] = arr[i++];
            }
            else{
                mix[k++] = arr[j++];
            }
        }

        while(i<m){
            mix[k++] = arr[i++];
        }

        while(j<e){
            mix[k++] = arr[j++];
        }

        for(int l =0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,8,3,4,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

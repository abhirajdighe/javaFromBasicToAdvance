public class bookAllocationProblem {

    public static boolean isPossible(int[] arr,int n,int m , int mid){
        int studentCount = 1;
        int pageSum = 0;

        for(int i =0;i<n;i++){
            if(pageSum + arr[i]<= mid){
                pageSum += arr[i];
            }
            else{
                studentCount++;
                if(studentCount>m || arr[i] > mid){
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }

    public static int allocateBook(int [] arr,int n, int m){
        int s =0;
        int sum =0;

        for(int e:arr){
            sum+=e;
        }

        int e = sum;
        int ans = -1;
        int mid = s + (e-s)/2;

        while (s<=e){
            if(isPossible(arr,n,m,mid)){
                ans = mid;
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] books = {10,20,30,40}; // Number of pages in each book
        int n = books.length; // Total number of books
        int m = 2; // Number of students

        int result = allocateBook(books, n, m);
        System.out.println("Minimum maximum pages allocated: " + result);
    }
}

public class sqrtUsingBinarySearch {

    public  static long binarySearch(int n){
        long s = 0;
        long e = n-1;
        long mid = s + (e-s)/2;
        long ans=0;

        while (s<=e){
            long square = mid*mid;
            if(square == n){
                return mid;
            }

            if(square < n){
                ans = mid;
                s= mid +1;
            }
            else{
                e = mid-1;
            }

            mid = s + (e-s)/2;
        }
        return ans;
    }

    static long mySqrt(int n){
        return binarySearch(n);
    }
    public static void main(String[] args) {
        int[] testCases = {0, 1, 2, 3, 4, 10, 16, 25, 26, 2147395600, 2147483647};

        for (int n : testCases) {
            System.out.println("√" + n + " ≈ " + mySqrt(n));
        }
    }
}

public class countNumber {

    public static int count(int n ,int cnt){
        return helper( n,cnt);
    }

    private static int helper(int n,int cnt){
        if(n<=0){
            return cnt;
        }

        int d = n%10;
        if(d!=0){
            return helper(n/10,cnt+1);
        }

        return count(n/10,cnt);
    }

    public static void main(String[] args) {
        int n = 440050506;

        int cnt = 0;


        System.out.println(count(n,cnt));
    }
}

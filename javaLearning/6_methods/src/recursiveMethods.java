public class recursiveMethods {
    static int stairs(int n){
        if(n<=1){
            return 1;
        }
        int incl1 = 1+stairs(n-1);
        int incl2 = 1+stairs(n-2);
        return Math.min(incl1,incl2);
    }
    public static void main(String[] args){
        int n = 14;
        System.out.println(stairs(n));
    }
}

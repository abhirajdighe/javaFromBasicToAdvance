public class methodRepresentation {
    static int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args){
        int a = 20 , b = 50, c;
        c = max(a,b);
        System.out.printf("greatest element is: %d",c);
    }
}

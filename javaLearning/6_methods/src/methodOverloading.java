public class methodOverloading {
    static int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    static float max(float x,float y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] arg){
        System.out.println(max(1.1f,2));
    }
}

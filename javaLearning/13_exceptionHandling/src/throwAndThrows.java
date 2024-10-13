class NegativeDimesionException extends Exception{
    public String tostring(){
        return "Dimensions of a rectangle cannot be negative";
    }
}

public class throwAndThrows {

    static int area(int l,int b)throws NegativeDimesionException{
        if(l<0 || b<0)
            throw new NegativeDimesionException();
        return l*b;
    }
    static void meth1() throws NegativeDimesionException{
        area(10,5);
    }
//    static void fun3(){
//        fun2();
//    }

    public static void main(String[] args) {
        try{
            meth1();
        }
        catch (NegativeDimesionException e){
            System.out.println(e.tostring());
        }

    }
}

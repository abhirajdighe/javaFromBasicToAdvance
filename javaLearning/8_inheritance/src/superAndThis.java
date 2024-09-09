class parent{
    public int x;

    public parent(int x){
        System.out.println("Parent Constructor!!");
        this.x = x;
        System.out.println(this.x);
    }
}

class child extends parent{
    public int y;

    public child(int x,int y){
        super(x);
        System.out.println("Child Constructor!!");
        this.y = y;
        System.out.println(this.y);
    }
}




public class superAndThis {
    public static void main(String[] args){
        child pt = new child(3,4);
    }
}

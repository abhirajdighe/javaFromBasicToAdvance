class data{
    private int length;
    private int breadth;

    int getLength(){
        return length;
    }

    int getBreadth(){
        return breadth;
    }

    void set(int l,int b){
        length = l;
        breadth = b;
    }

    void area(){
        System.out.println(length*breadth);
    }
}

public class dataHidding {
    public static void main(String[] args){
        data d = new data();
        d.set(5,6);
        System.out.println(d.getLength() +"\n"+d.getBreadth());
        d.area();
    }
}

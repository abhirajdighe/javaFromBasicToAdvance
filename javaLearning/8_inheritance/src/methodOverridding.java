
class superClass{
    public void display(){
        System.out.println("Hello!!!");
    }

    public void print(){
        System.out.println("Print");
    }
}

class sub extends superClass{
    @Override
    public void display(){
        System.out.println("Hello Welcome!!!");
    }

    public void print(){
        System.out.println("Print in sub class");
    }
}




public class methodOverridding {
    public static void main(String[] args){
        sub sb = new sub();
        sb.display();
        sb.print();
    }
}

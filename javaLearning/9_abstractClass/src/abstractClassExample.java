

abstract class Super{

    abstract public void methOne();
    public void methTwo(){
        System.out.println("Hi");
    }
}

class sub extends Super{

    public void methOne(){
        System.out.println("Overrided method");
    }

    Super sc = new sub();
}

public class abstractClassExample {

    public static void main(String[] args){
        sub sb = new sub();
        sb.methTwo();
    }
}

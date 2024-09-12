abstract class my{
    abstract void display();
}

class outerClass{
    public void meth(){
        my m = new my(){
            public void display(){
                System.out.println("Hello");
            }
        };

        m.display();
    }
}

public class anonymousInnerClass {
    public static void main(String[] args){
        outerClass oc = new outerClass();
        oc.meth();
    }
}

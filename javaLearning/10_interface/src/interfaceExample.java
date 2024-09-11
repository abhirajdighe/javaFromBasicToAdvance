interface Test{
    void meth1();
    void meth2();
}

class MyInterface implements Test{
    public void meth1(){
        System.out.println("Meth1 of class MyInterface!!");
    }
    public void meth2(){
        System.out.println("Meth2 of class MyInterface!!");
    }
    public void meth3(){
        System.out.println("Meth3 of class MyInterface!!");
    }
}

public class interfaceExample {
    public static void main(String[] args){
        Test t = new MyInterface();
        t.meth1();
        t.meth2();

        System.out.println(" ");

        MyInterface mi = new MyInterface();
        mi.meth1();
        mi.meth2();
        mi.meth3();
    }
}

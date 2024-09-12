class OuterTest{
    static int x =10;
    int y =20;

    static class InnerClass{
        void display(){
            System.out.println("Static meber of outer class in static inner class"+x);
            // System.out.println(y);
            // ---> static class can only access static member of class
        }
    }
}

public class staticInnerClass {
    public static void main(String[] args){
        OuterTest.InnerClass oci = new OuterTest.InnerClass();
        oci.display();
    }
}

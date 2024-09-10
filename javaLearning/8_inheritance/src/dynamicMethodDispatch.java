class Super{
    public void method1(){
        System.out.println("Mehtod 1");
    }

    public void method2(){
        System.out.println("Mehtod 2");
    }
}

class subClass extends Super{
    public void method2(){
        System.out.println("Mehtod 2");
    }
    public void method3(){
        System.out.println("Mehtod 3");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args){
//        superClass sc = new Super();  // its not allowed in java
        Super sb = new subClass();

        sb.method1();
        sb.method2();
//        sb.method3();  // its cannot be called
    }
}

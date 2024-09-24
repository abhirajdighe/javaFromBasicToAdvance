class firstClass{
    final int MIN=10;
    final int NORMAL;
    final int MAX;
    {
        NORMAL = 20;
    }

    firstClass(){
        MAX = 30;
    }

    final public void printValue(){
        System.out.println("Hello");
    }
}

class secondClass extends  firstClass{
    // cannot do this
//    @Override
//    public void printValue(){
//        System.out.println("Hello");
//    }
}

final class thirdClass{
    // Cannot override this class
}

public class finalVaribaleMethodAndClass {
    public static void main(String[] args){

    }
}


import java.lang.Object;

class MyObject{

}

public class objectClassMethods {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        System.out.println(o1);
        System.out.println(o1.toString());
        System.out.println(o2.equals(o1));
        System.out.println(o3.equals(o1));
        System.out.println(o1.hashCode());

        // we can override methods like equals(object o), toString(), hasCode()
    }
}

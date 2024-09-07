import java.util.SplittableRandom;

public class passingObjectAsParameter {
    void update(int A[]){
        A[0] = 25;
    }

    static String findName(String email){
        int a = email.indexOf('@');
        String name = email.substring(0,a);
        return name;
    }

    public static void main(String[] args){
        int A[] ={2,3,4,5};
        System.out.println(A[0]);
        passingObjectAsParameter poap = new passingObjectAsParameter();
        poap.update(A);
        System.out.println(A[0]);

        String str="abhiraj@gmail.com";
        String name = findName(str);
        System.out.println(name);

    }
}

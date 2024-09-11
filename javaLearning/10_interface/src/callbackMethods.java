
interface member{
    void callback();
}

class Store{
    member mem[] = new member[100];
    int count =0;
    void register(member m){
        mem[count++] = m;
    }
    void inviteSale(){
        for(int i =0;i<count;i++){
            mem[i].callback();
        }
    }
}
class Customer implements  member{
    String name;

    Customer(String n){
        name = n;
    }

    public void callback(){
        System.out.println("Ok, I will visit " + name);
    }
}

public class callbackMethods {
    public static void main(String[] args){
        Store st = new Store();
        Customer c1 = new Customer("Abhi");
        Customer c2 = new Customer("Yash");

        st.register(c1);
        st.register(c2);

        st.inviteSale();
    }
}
 
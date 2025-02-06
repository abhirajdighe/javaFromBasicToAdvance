enum Dept {
    CS,IT,ENTC,MECH,CIVIL
}

public class enumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CS;

        System.out.println(Dept.valueOf("IT"));

        Dept list[] = Dept.values();
        int i =1;
        for(Dept x : list){
            System.out.println( i++ + " " + x);
        }
    }
}

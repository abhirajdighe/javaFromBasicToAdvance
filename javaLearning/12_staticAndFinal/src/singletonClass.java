class coffeeMachine{
    private int coffeeQnt;
    private int waterQnt;

    static private coffeeMachine our = null;

    private coffeeMachine(){
        coffeeQnt =1;
        waterQnt = 2;
    }

    static public coffeeMachine getInstance(){
        if(our == null){
            our = new coffeeMachine();
        }
        return our;
    }
}

public class singletonClass {
    public static void main(String[] args){
        coffeeMachine c1 = coffeeMachine.getInstance();
        coffeeMachine c2 = coffeeMachine.getInstance();
        coffeeMachine c3 = coffeeMachine.getInstance();

        if(c1 == c2 && c2 == c3){
            System.out.println("Same");
        }

    }
}

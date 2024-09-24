
class HondaCity{
    static int price = 10;
    int a= 40;
    int b = 50;

    static double onRoadPrice(String city){
        switch (city){
            case "delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.09;
            default:
                return 0;
        }
    }
}

public class staticMembers {
    public static void main(String[] args){
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        System.out.println(h1.price);
        System.out.println(h2.price);

        System.out.println(HondaCity.price);
        System.out.println(HondaCity.onRoadPrice("delhi"));

    }
}

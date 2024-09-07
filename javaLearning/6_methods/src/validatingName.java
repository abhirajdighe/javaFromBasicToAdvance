public class validatingName {
    static boolean validateString(String name,int age){
        if(age > 22){
            return false;
        }

        for(int i =0;i<name.length();i++){
            if(name.matches("[a-zA-Z]") ){

            }
            else{
                return false;
            }
        }

        return true;
    }
    public static void main(String args){
        String name="Abhiraj";
        int age = 13;


        if(validateString(name,age)){
            System.out.println("Name and age is valid");
        }
        else{
            System.out.println("Name and age is not valid");
        }
    }
}

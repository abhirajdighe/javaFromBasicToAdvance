import java.util.Scanner;

public class findingProtocol {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the url: ");
        String url = scan.nextLine();

        String protocol = url.substring(0,url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("It's Hypertext transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("It's File transfer Protocol");
        }

        String extension = url.substring(url.lastIndexOf("."));

        if(extension.equals(".com")){
            System.out.println("commercial");
        }
        else if(extension.equals(".org")){
            System.out.println("Organisation");
        }

    }
}

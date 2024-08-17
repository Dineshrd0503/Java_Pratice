import java.util.Scanner;
public class Day24P1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Using regular expressions");
        System.out.println("Enter username of 13 chaercters");
        String username=sc.nextLine();
        System.out.println("Enter password of 8 chaercters");
        String password=sc.nextLine();
       if(username.matches("[a-zA-Z0-9@_$]{13}")&&password.matches("[a-zA-Z0-9@_$]{8}"))
       System.out.println("Valid username and password");
       else
       System.out.println("Invalid username and password");

    }
    
}
